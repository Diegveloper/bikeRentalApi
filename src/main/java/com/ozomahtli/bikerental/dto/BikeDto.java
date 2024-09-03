package com.ozomahtli.bikerental.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class BikeDto {
    private String name;
    private String brand;
    private String model;
    private String image;
    private int units;
    private String review;
}
