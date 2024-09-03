package com.ozomahtli.bikerental.controller;

import com.ozomahtli.bikerental.dto.BikeDto;
import com.ozomahtli.bikerental.services.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.List;

@RestController
public class ProductServiceController {
    @Autowired
    BikeService service;

    @GetMapping("/api/bikes")
    public ResponseEntity<Collection<BikeDto>> getBikes(){
        Collection<BikeDto> bikes = service.getBikes();
        System.out.println("");
        return new ResponseEntity<>(bikes, HttpStatus.OK);
    }

    @PostMapping("/api/bikes")
    public ResponseEntity<BikeDto> createBike(@RequestBody BikeDto bike){
        service.createBike(bike);
        return new ResponseEntity<>(bike, HttpStatus.CREATED);
    }
}
