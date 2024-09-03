package com.ozomahtli.bikerental.business;

import com.ozomahtli.bikerental.dto.BikeDto;
import com.ozomahtli.bikerental.entities.BikeEntity;

import java.util.Collection;

public interface BikeOperations {
    BikeDto createBike(BikeDto dto);
    void getBike(int id);
    void updateBike();
    void deleteBike(int id);
    void replaceBike();
    Collection<BikeDto> getBikes();
}
