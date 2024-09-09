package com.ozomahtli.bikerental.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @Size(min = 1, max =200, message = "Names Min length is 1 and Max lenght is 200")
    private String name;
    @NotBlank(message = "Brand is mandatory")
    @NotNull(message = "Brand cannot be null")
    @Size(min = 1, max =200, message = "Names Min length is 1 and Max lenght is 200")
    private String brand;
    private String image;
    private int units;
    private String description;
    private float review;
}
