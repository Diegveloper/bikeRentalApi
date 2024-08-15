package com.ozomahtli.bikerental.services;

import com.ozomahtli.bikerental.business.BikeOperations;
import org.springframework.stereotype.Service;

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
    public Collection<Object> getBikes() {
        return List.of();
    }
}
