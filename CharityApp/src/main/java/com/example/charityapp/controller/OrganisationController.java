package com.example.charityapp.controller;

import com.charity.dto.OrganisationDTO;
import com.charity.service.OrganisationService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organisations")
@RequiredArgsConstructor
public class OrganisationController {

    private final OrganisationService organisationService;

    @PostMapping
    public ResponseEntity<OrganisationDTO> createOrganisation(@RequestBody OrganisationDTO organisationDTO) {
        return ResponseEntity.ok(organisationService.save(organisationDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrganisationDTO> getOrganisation(@PathVariable Long id) {
        return ResponseEntity.ok(organisationService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Page<OrganisationDTO>> getAllOrganisations(Pageable pageable) {
        return ResponseEntity.ok(organisationService.findAll(pageable));
    }

    @GetMapping("/search")
    public ResponseEntity<Page<OrganisationDTO>> searchOrganisations(
            @RequestParam String nom, Pageable pageable) {
        return ResponseEntity.ok(organisationService.searchByNom(nom, pageable));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrganisation(@PathVariable Long id) {
        organisationService.delete(id);
        return ResponseEntity.ok().build();
    }
}
