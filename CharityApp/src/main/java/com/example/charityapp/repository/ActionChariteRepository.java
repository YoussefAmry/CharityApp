package com.example.charityapp.repository;

import com.example.charityapp.entity.ActionCharite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionChariteRepository extends JpaRepository<ActionCharite, Long> {
    Page<ActionCharite> findByOrganisationId(Long organisationId, Pageable pageable);
    Page<ActionCharite> findByTitreContaining(String titre, Pageable pageable);
    Page<ActionCharite> findByLieuContaining(String lieu, Pageable pageable);
} 