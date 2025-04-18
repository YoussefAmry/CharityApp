package com.example.charityapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "organisations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String adresse;

    @Column(nullable = false, unique = true)
    private String numeroIdentification;

    @Column(nullable = false)
    private String contact;

    @Column(nullable = false)
    private String logo;

    @Column(nullable = false, length = 2000)
    private String description;

    @OneToMany(mappedBy = "organisation", cascade = CascadeType.ALL)
    private List<ActionCharite> actions;

    public void ajouterAction() {
        // Logique d'ajout d'action
    }

    public void modifierAction() {
        // Logique de modification d'action
    }
} 