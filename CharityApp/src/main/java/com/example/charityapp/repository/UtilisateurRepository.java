package com.example.charityapp.repository;

import com.example.charityapp.entity.Utilisateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Page<Utilisateur> findByRole(String role, Pageable pageable);
    Page<Utilisateur> findByNomContaining(String nom, Pageable pageable);
    Utilisateur findByEmail(String email);
} 