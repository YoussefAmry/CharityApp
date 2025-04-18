package com.example.charityapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "actions_charite")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActionCharite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    @Column(nullable = false, length = 2000)
    private String description;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private String lieu;

    @Column(nullable = false)
    private double objectifCollecte;

    @Column(nullable = false)
    private double sommeActuelle;

    @OneToMany(mappedBy = "actionCharite", cascade = CascadeType.ALL)
    private List<com.charity.entity.Don> dons;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organisation_id", nullable = false)
    private com.charity.entity.Organisation organisation;

    public void modifier() {
        // Logique de modification
    }

    public void archiver() {
        // Logique d'archivage
    }

    public void participer() {
        // Logique de participation
    }
} 