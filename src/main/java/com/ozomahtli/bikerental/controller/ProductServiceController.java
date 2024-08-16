package com.ozomahtli.bikerental.controller;

import com.ozomahtli.bikerental.services.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.List;

@RestController
public class ProductServiceController {
    @Autowired
    BikeService service;

    @GetMapping("/api/bikes")
    public ResponseEntity<Object> getBikes(){
        Collection bikes = service.getBikes();
        return new ResponseEntity<>(bikes, HttpStatus.OK);
    }
}
