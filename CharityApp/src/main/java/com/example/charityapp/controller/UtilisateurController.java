package com.example.charityapp.controller;

import com.example.charityapp.dto.UtilisateurDTO;
import com.charityapp.service.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/utilisateurs")
@RequiredArgsConstructor
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    @PostMapping
    public ResponseEntity<UtilisateurDTO> createUtilisateur(@RequestBody UtilisateurDTO utilisateurDTO) {
        return ResponseEntity.ok(utilisateurService.save(utilisateurDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UtilisateurDTO> getUtilisateur(@PathVariable Long id) {
        return ResponseEntity.ok(utilisateurService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Page<UtilisateurDTO>> getAllUtilisateurs(Pageable pageable) {
        return ResponseEntity.ok(utilisateurService.findAll(pageable));
    }

    @GetMapping("/role/{role}")
    public ResponseEntity<Page<UtilisateurDTO>> getUtilisateursByRole(
            @PathVariable String role, Pageable pageable) {
        return ResponseEntity.ok(utilisateurService.findByRole(role, pageable));
    }

    @GetMapping("/search")
    public ResponseEntity<Page<UtilisateurDTO>> searchUtilisateurs(
            @RequestParam String nom, Pageable pageable) {
        return ResponseEntity.ok(utilisateurService.searchByNom(nom, pageable));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUtilisateur(@PathVariable Long id) {
        utilisateurService.delete(id);
        return ResponseEntity.ok().build();
    }
}
