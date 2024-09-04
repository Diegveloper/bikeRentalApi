package com.ozomahtli.bikerental.controller;

import com.ozomahtli.bikerental.dto.ErrorDto;
import com.ozomahtli.bikerental.exceptions.InvalidInput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = InvalidInput.class)
    public ResponseEntity<ErrorDto> invalidInputParameters(InvalidInput e){
        return e.getResponse();
    }
}
