package com.ozomahtli.bikerental.controller;

import com.ozomahtli.bikerental.services.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductServiceController {
    @Autowired
    BikeService service;

    @GetMapping("/api/bikes")
    public ResponseEntity<Object> getBikes(){
        return new ResponseEntity<>("ahi te va", HttpStatus.OK);
    }
}
