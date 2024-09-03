package com.ozomahtli.bikerental.services;

import com.ozomahtli.bikerental.business.BikeOperations;
import com.ozomahtli.bikerental.dto.BikeDto;
import com.ozomahtli.bikerental.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class BikeService implements BikeOperations {

    @Autowired
    private BikeRepository repo;

    @Override
    public void createBike(BikeDto dto) {

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

        return list;
    }
}
