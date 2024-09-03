package com.ozomahtli.bikerental.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="bikes")
public class BikeEntity {
    @Id
    @SequenceGenerator(name = "bikes_generator", sequenceName="bikes_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bikes_generator")
    private Long id;
    private String name;
    private String brand;
    private String image;
    private String description;
    private int units;
    private float review;

}
