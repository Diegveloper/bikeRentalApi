package com.ozomahtli.bikerental.service;

import com.ozomahtli.bikerental.dto.BikeDto;
import com.ozomahtli.bikerental.entities.BikeEntity;
import com.ozomahtli.bikerental.mapper.BikeMapper;
import com.ozomahtli.bikerental.repository.BikeRepository;
import com.ozomahtli.bikerental.services.BikeService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class BikeServiceTest {

    @Mock
    private BikeRepository repo;

    @Mock
    private BikeMapper mapper;

    @InjectMocks
    private BikeService service;





    @Test
    public void BikeService_CreateBike_ReturnsBikeDto(){

        BikeEntity bikeEntity = BikeEntity.builder().name("test bike 1").brand("Ozomahtli"). build();
        BikeDto bikeDto = BikeDto.builder().name("test bike 1").brand("Ozomahtli").build();
        when(repo.save(Mockito.any(BikeEntity.class))).thenReturn(bikeEntity);
        when(mapper.toEntity(bikeDto)).thenReturn(bikeEntity);
        when(mapper.toDto(bikeEntity)).thenReturn(bikeDto);
        BikeDto savedBike = service.createBike(bikeDto);
        Assertions.assertThat(savedBike).isNotNull();

    }

}
