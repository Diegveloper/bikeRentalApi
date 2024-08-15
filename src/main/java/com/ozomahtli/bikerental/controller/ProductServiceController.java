package com.ozomahtli.bikerental.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductServiceController {


    @GetMapping("/api/bikes")
    public ResponseEntity<Object> getBikes(){
        return new ResponseEntity<>("ahi te va", HttpStatus.OK);
    }
}
