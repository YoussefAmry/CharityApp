package com.example.charityapp.mapper;

import com.example.charityapp.dto.OrganisationDTO;
import com.example.charityapp.entity.Organisation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface OrganisationMapper {
    OrganisationMapper INSTANCE = Mappers.getMapper(OrganisationMapper.class);

    @Mapping(target = "actions", ignore = true)
    Organisation toEntity(OrganisationDTO organisationDTO);

    OrganisationDTO toDTO(Organisation organisation);
} 