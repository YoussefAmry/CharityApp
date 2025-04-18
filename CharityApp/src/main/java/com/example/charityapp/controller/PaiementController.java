package com.example.charityapp.controller;

import com.charity.dto.PaiementDTO;
import com.charity.service.PaiementService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paiements")
@RequiredArgsConstructor
public class PaiementController {

    private final PaiementService paiementService;

    @PostMapping
    public ResponseEntity<PaiementDTO> createPaiement(@RequestBody PaiementDTO paiementDTO) {
        return ResponseEntity.ok(paiementService.save(paiementDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaiementDTO> getPaiement(@PathVariable Long id) {
        return ResponseEntity.ok(paiementService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Page<PaiementDTO>> getAllPaiements(Pageable pageable) {
        return ResponseEntity.ok(paiementService.findAll(pageable));
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<Page<PaiementDTO>> getPaiementsByStatus(
            @PathVariable String status, Pageable pageable) {
        return ResponseEntity.ok(paiementService.findByStatus(status, pageable));
    }

    @GetMapping("/don/{donId}")
    public ResponseEntity<Page<PaiementDTO>> getPaiementsByDon(
            @PathVariable Long donId, Pageable pageable) {
        return ResponseEntity.ok(paiementService.findByDon(donId, pageable));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaiement(@PathVariable Long id) {
        paiementService.delete(id);
        return ResponseEntity.ok().build();
    }
}
