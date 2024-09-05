package com.ozomahtli.bikerental.repo;

import com.ozomahtli.bikerental.entities.BikeEntity;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ozomahtli.bikerental.repository.BikeRepository;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class BikeRepositoryTest {
    @Autowired
    private BikeRepository repo;

    @Test
    public void BikeRepo_SaveBike_ReturnSavedBike(){
        //Arrange
        BikeEntity bike = BikeEntity.builder()
                .name("test bike")
                .brand("ozomahtli bikes")
                .build();
        //Act
        BikeEntity savedBike = repo.save(bike);

        //Assert
        Assertions.assertThat(savedBike).isNotNull();

        assert savedBike.getId() != null;
        assert savedBike.getName().equals("test bike");
        assert savedBike.getBrand().equals("ozomahtli bikes");


    }
}
