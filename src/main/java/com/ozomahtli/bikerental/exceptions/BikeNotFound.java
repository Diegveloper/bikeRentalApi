package com.ozomahtli.bikerental.exceptions;

import com.ozomahtli.bikerental.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class BikeNotFound extends RuntimeException{

    private List<Object> errors = new ArrayList<>();
    public BikeNotFound(int id) {
        super("Bike with id " + id + " not found.");
        String errorMsg = "Bike with id %d does not exist.";
        this.errors.add(String.format(errorMsg, id));

    }
    public ResponseEntity<ErrorDto> getResponse(){
        return new ResponseEntity<>(new ErrorDto(404,"Bike not found", this.errors), HttpStatus.NOT_FOUND);
    }

}
