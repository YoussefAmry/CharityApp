package com.example.charityapp.repository;

import com.example.charityapp.entity.Don;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonRepository extends JpaRepository<Don, Long> {
    Page<Don> findByUtilisateurId(Long utilisateurId, Pageable pageable);
    Page<Don> findByActionChariteId(Long actionChariteId, Pageable pageable);
    Page<Don> findByMontantGreaterThan(double montant, Pageable pageable);
} 