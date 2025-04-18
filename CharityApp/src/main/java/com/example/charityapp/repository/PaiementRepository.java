package com.example.charityapp.repository;

import com.example.charityapp.entity.Paiement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long> {
    Page<Paiement> findByStatus(String status, Pageable pageable);
    Page<Paiement> findByMethode(String methode, Pageable pageable);
    Page<Paiement> findByDonId(Long donId, Pageable pageable);
} 