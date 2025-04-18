package com.example.charityapp.repository;

import com.example.charityapp.entity.Organisation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisationRepository extends JpaRepository<Organisation, Long> {
    Page<Organisation> findByNomContaining(String nom, Pageable pageable);
    Organisation findByNumeroIdentification(String numeroIdentification);
} 