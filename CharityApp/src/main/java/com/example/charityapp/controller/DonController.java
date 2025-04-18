package com.example.charityapp.controller;

import com.charity.dto.DonDTO;
import com.charity.service.DonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dons")
@RequiredArgsConstructor
public class DonController {

    private final DonService donService;

    @PostMapping
    public ResponseEntity<DonDTO> createDon(@RequestBody DonDTO donDTO) {
        return ResponseEntity.ok(donService.save(donDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DonDTO> getDon(@PathVariable Long id) {
        return ResponseEntity.ok(donService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Page<DonDTO>> getAllDons(Pageable pageable) {
        return ResponseEntity.ok(donService.findAll(pageable));
    }

    @GetMapping("/utilisateur/{utilisateurId}")
    public ResponseEntity<Page<DonDTO>> getDonsByUtilisateur(
            @PathVariable Long utilisateurId, Pageable pageable) {
        return ResponseEntity.ok(donService.findByUtilisateur(utilisateurId, pageable));
    }

    @GetMapping("/action/{actionChariteId}")
    public ResponseEntity<Page<DonDTO>> getDonsByActionCharite(
            @PathVariable Long actionChariteId, Pageable pageable) {
        return ResponseEntity.ok(donService.findByActionCharite(actionChariteId, pageable));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDon(@PathVariable Long id) {
        donService.delete(id);
        return ResponseEntity.ok().build();
    }
}
