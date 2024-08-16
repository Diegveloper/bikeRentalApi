package com.ozomahtli.bikerental.business;

import com.ozomahtli.bikerental.dto.BikeDto;

import java.util.Collection;

public interface BikeOperations {
    void createBike();
    void getBike(int id);
    void updateBike();
    void deleteBike(int id);
    void replaceBike();
    Collection<BikeDto> getBikes();
}
