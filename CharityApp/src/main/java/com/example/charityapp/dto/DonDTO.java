package com.example.charityapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonDTO {
    private Long id;
    private double montant;
    private Date date;
    private Long utilisateurId;
    private String utilisateurNom;
    private Long actionChariteId;
    private String actionChariteTitre;
} 