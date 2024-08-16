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
    private String id;
    private String brand;
    private String model;
    private String image;
    private String state;
}
