package com.ozomahtli.bikerental.services;

import com.ozomahtli.bikerental.business.BikeOperations;
import com.ozomahtli.bikerental.dto.BikeDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class BikeService implements BikeOperations {
    @Override
    public void createBike() {

    }

    @Override
    public void getBike(int id) {

    }

    @Override
    public void updateBike() {

    }

    @Override
    public void deleteBike(int id) {

    }

    @Override
    public void replaceBike() {

    }

    @Override
    public Collection<BikeDto> getBikes() {
        List<BikeDto> list = new ArrayList<>();
        BikeDto bike1 = BikeDto.builder()
                .build();
        return List.of();
    }
}
