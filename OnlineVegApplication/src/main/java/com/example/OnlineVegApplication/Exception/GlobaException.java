package com.example.OnlineVegApplication.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobaException {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(VegetableNotFoundException.class)
    public ResponseEntity<?> handleVegetableException(VegetableNotFoundException e){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(FarmerNotFoundException.class)
    public ResponseEntity<?> handleFarmerException(FarmerNotFoundException e){

        return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);

    }
}
