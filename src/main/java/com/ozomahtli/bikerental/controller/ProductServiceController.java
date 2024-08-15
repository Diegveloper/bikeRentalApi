package com.ozomahtli.bikerental.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductServiceController {
    @GetMapping("/api/bikes")
    public String getBikes(){
        return "nop";
    }
}
