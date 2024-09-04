package com.ozomahtli.bikerental.exceptions;

import com.ozomahtli.bikerental.dto.ErrorDto;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;
import java.util.stream.Collectors;

public class InvalidInput extends RuntimeException{
    List<Object> errors;
    public InvalidInput(BindingResult br){
        this.errors = br.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.toList());

    }
    public ResponseEntity<ErrorDto> getResponse(){
        return new ResponseEntity<>(new ErrorDto(404,"Invalid input", this.errors), HttpStatus.BAD_REQUEST);
    }
}
