package com.ozomahtli.bikerental.controller;

import com.ozomahtli.bikerental.dto.BikeDto;
import com.ozomahtli.bikerental.exceptions.InvalidInput;
import com.ozomahtli.bikerental.services.BikeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
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
        return new ResponseEntity<>(bikes, HttpStatus.OK);
    }

    @PostMapping("/api/bikes")
    public ResponseEntity<BikeDto> createBike(@Valid @RequestBody BikeDto bike, BindingResult result){
        if(result.hasErrors()){
            throw new InvalidInput(result);
        }

        BikeDto output = service.createBike(bike);
        return new ResponseEntity<>(output, HttpStatus.CREATED);
    }
}
