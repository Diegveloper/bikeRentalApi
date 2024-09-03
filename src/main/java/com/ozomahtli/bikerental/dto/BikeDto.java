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
    private Long id;
    private String name;
    private String brand;
    private String image;
    private int units;
    private String description;
    private float review;
}
