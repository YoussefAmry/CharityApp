package com.example.charityapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActionChariteDTO {
    private Long id;
    private String titre;
    private String description;
    private Date date;
    private String lieu;
    private double objectifCollecte;
    private double sommeActuelle;
    private Long organisationId;
    private String organisationNom;
} 