package com.ozomahtli.bikerental.repo;

import com.ozomahtli.bikerental.entities.BikeEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ozomahtli.bikerental.repository.BikeRepository;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    @Test
    public void BikeRepo_GetAll_ReturnAll(){
        //Arrange
        BikeEntity bike1 = BikeEntity.builder()
                .name("test bike 1")
                .brand("ozomahtli bikes")
                .build();
        BikeEntity bike2 = BikeEntity.builder()
                .name("test bike 2")
                .brand("ozomahtli bikes")
                .build();
        repo.save(bike1);
        repo.save(bike2);

        //Act
        Iterable<BikeEntity> allBikes = repo.findAll();

        //Assert
        Assertions.assertThat(allBikes).hasSize(2);
        Assertions.assertThat(allBikes).contains(bike1, bike2);
    }

    @Test
    public void BikeRepo_FindById_ReturnBika(){
        //Arrange
        BikeEntity bike1 = BikeEntity.builder()
                .name("test bike 1")
                .brand("ozomahtli bikes")
                .build();

        repo.save(bike1);

        BikeEntity bike = repo.findById(bike1.getId()).get();

        //Act
        Assertions.assertThat(bike).isNotNull();

    }
}
