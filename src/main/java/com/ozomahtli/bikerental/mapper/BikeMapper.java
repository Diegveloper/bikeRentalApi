package com.ozomahtli.bikerental.mapper;

import com.ozomahtli.bikerental.dto.BikeDto;
import com.ozomahtli.bikerental.entities.BikeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BikeMapper {
    BikeEntity toEntity(BikeDto dto);
    BikeDto toDto(BikeEntity entity);
}
