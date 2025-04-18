package com.example.charityapp.controller;

import com.example.charityapp.dto.ActionChariteDTO;
import com.example.charityapp.service.ActionChariteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/actions")
@RequiredArgsConstructor
public class ActionChariteController {

    private final ActionChariteService actionChariteService;

    @PostMapping
    public ResponseEntity<ActionChariteDTO> creerAction(@Valid @RequestBody ActionChariteDTO actionChariteDTO) {
        return ResponseEntity.ok(actionChariteService.creerAction(actionChariteDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActionChariteDTO> getAction(@PathVariable Long id) {
        return ResponseEntity.ok(actionChariteService.getAction(id));
    }

    @GetMapping
    public ResponseEntity<Page<ActionChariteDTO>> getAllActions(Pageable pageable) {
        return ResponseEntity.ok(actionChariteService.getAllActions(pageable));
    }

    @GetMapping("/organisation/{organisationId}")
    public ResponseEntity<Page<ActionChariteDTO>> getActionsByOrganisation(
            @PathVariable Long organisationId,
            Pageable pageable) {
        return ResponseEntity.ok(actionChariteService.getActionsByOrganisation(organisationId, pageable));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> supprimerAction(@PathVariable Long id) {
        actionChariteService.supprimerAction(id);
        return ResponseEntity.noContent().build();
    }
}