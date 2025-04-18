package com.example.charityapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganisationDTO {
    private Long id;
    private String nom;
    private String adresse;
    private String numeroIdentification;
    private String contact;
    private String logo;
    private String description;
} 