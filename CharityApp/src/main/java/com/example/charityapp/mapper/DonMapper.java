package com.example.charityapp.mapper;

import com.example.charityapp.dto.DonDTO;
import com.example.charityapp.entity.Don;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DonMapper {
    DonMapper INSTANCE = Mappers.getMapper(DonMapper.class);

    @Mapping(target = "utilisateurId", source = "utilisateur.id")
    @Mapping(target = "utilisateurNom", source = "utilisateur.nom")
    @Mapping(target = "actionChariteId", source = "actionCharite.id")
    @Mapping(target = "actionChariteTitre", source = "actionCharite.titre")
    DonDTO toDTO(Don don);

    @Mapping(target = "utilisateur", ignore = true)
    @Mapping(target = "actionCharite", ignore = true)
    Don toEntity(DonDTO donDTO);
} 