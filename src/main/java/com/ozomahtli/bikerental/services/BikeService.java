package com.ozomahtli.bikerental.services;

import com.ozomahtli.bikerental.business.BikeOperations;
import com.ozomahtli.bikerental.dto.BikeDto;
import com.ozomahtli.bikerental.entities.BikeEntity;
import com.ozomahtli.bikerental.exceptions.BikeNotFound;
import com.ozomahtli.bikerental.mapper.BikeMapper;
import com.ozomahtli.bikerental.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


@Service
public class BikeService implements BikeOperations {

    @Autowired
    private BikeRepository repo;

    @Autowired
    private BikeMapper bikeMapper;


    @Override
    public BikeDto createBike(BikeDto dto) {
        BikeEntity entity = bikeMapper.toEntity(dto);
        return bikeMapper.toDto(repo.save(entity));
    }

    @Override
    public BikeDto getBike(int id) {
        Optional<BikeEntity> bike = repo.findById((long) id);
        if(bike.isPresent()){
            BikeEntity e = bike.get();
            return bikeMapper.toDto(e);
        }
        else{
            throw new BikeNotFound(id);
        }

    }

    @Override
    public BikeDto updateBike(BikeDto bike) {
        return null;
    }

    @Override
    public BikeDto deleteBike(int id) {
        Optional<BikeEntity> bike = repo.findById((long) id);
        if(bike.isPresent()){
            BikeEntity e = bike.get();
            repo.delete(e);
            return bikeMapper.toDto(e);
        }
        else{
            throw new BikeNotFound(id);
        }
    }

    @Override
    public BikeDto replaceBike(int id, BikeDto bike) {

        Optional<BikeEntity> bikeToUpdate = repo.findById( (long) id);
        if(bikeToUpdate.isPresent()){
            BikeEntity e = bikeToUpdate.get();
            e.setName(bike.getName());
            e.setBrand(bike.getBrand());
            e.setImage(bike.getImage());
            e.setDescription(bike.getDescription());
            e.setUnits(bike.getUnits());
            e.setReview(bike.getReview());
            return bikeMapper.toDto(repo.save(e));

        }
        else{
            throw new BikeNotFound(id);
        }
    }

    @Override
    public Collection<BikeDto> getBikes() {
        List<BikeDto> list = new ArrayList<>();
        repo.findAll().forEach(entity -> list.add(bikeMapper.toDto(entity)));
        return list;
    }


}
