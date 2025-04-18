package com.example.charityapp.mapper;

import com.example.charityapp.dto.UtilisateurDTO;
import com.example.charityapp.entity.Utilisateur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UtilisateurMapper {
    UtilisateurMapper INSTANCE = Mappers.getMapper(UtilisateurMapper.class);

    @Mapping(target = "motDePasse", ignore = true)
    UtilisateurDTO toDTO(Utilisateur utilisateur);

    @Mapping(target = "historiqueDons", ignore = true)
    Utilisateur toEntity(UtilisateurDTO utilisateurDTO);
} 