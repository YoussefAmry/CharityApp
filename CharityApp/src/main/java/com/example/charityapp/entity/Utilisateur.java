package com.example.charityapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "utilisateurs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String motDePasse;

    @Column(nullable = false)
    private String role;  // utilisateur, admin, super_admin

    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private List<Don> historiqueDons;

    public void seConnecter() {
        // Logique de connexion
    }

    public void seDeconnecter() {
        // Logique de déconnexion
    }

    public void modifierProfil() {
        // Logique de modification de profil
    }
} 