package com.ozomahtli.bikerental.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotBlank(message = "Name is mandatory")
    @NotNull(message = "Name cannot be null")
    private String name;
    @NotBlank(message = "Brand is mandatory")
    @NotNull(message = "Brand cannot be null")
    private String brand;
    private String image;
    private int units;
    private String description;
    private float review;
}
