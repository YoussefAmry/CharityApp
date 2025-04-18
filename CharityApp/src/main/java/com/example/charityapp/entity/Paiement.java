package com.example.charityapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "paiements")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double montant;

    @Column(nullable = false)
    private String methode; // String (PayPal, Stripe)

    @Column(nullable = false)
    private String status;

    @OneToOne
    @JoinColumn(name = "don_id", nullable = false)
    private Don don;

    public void validerPaiement() {
        // Logique de validation du paiement
    }
} 