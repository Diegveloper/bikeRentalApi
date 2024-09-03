package com.ozomahtli.bikerental.repository;

import com.ozomahtli.bikerental.entities.BikeEntity;
import org.springframework.data.repository.CrudRepository;

public interface BikeRepository extends CrudRepository<BikeEntity, Long> {
}
