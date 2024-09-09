package com.ozomahtli.bikerental.business;

import com.ozomahtli.bikerental.dto.BikeDto;
import com.ozomahtli.bikerental.entities.BikeEntity;

import java.util.Collection;

public interface BikeOperations {
    BikeDto createBike(BikeDto dto);
    BikeDto getBike(int id);
    BikeDto updateBike();
    BikeDto deleteBike(int id);
    BikeDto replaceBike(int id, BikeDto bike);
    Collection<BikeDto> getBikes();
}
