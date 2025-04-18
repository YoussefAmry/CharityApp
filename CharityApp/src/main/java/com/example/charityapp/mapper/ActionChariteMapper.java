package com.example.charityapp.mapper;

import com.example.charityapp.dto.ActionChariteDTO;
import com.example.charityapp.entity.ActionCharite;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ActionChariteMapper {
    ActionChariteMapper INSTANCE = Mappers.getMapper(ActionChariteMapper.class);

    @Mapping(target = "organisationId", source = "organisation.id")
    @Mapping(target = "organisationNom", source = "organisation.nom")
    ActionChariteDTO toDTO(ActionCharite actionCharite);

    @Mapping(target = "organisation", ignore = true)
    @Mapping(target = "dons", ignore = true)
    ActionCharite toEntity(ActionChariteDTO actionChariteDTO);
} 