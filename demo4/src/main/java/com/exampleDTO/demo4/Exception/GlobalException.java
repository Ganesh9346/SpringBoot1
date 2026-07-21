package com.exampleDTO.demo4.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> handleRunExcutionExceptionStringResponseEntity(RuntimeException e){
        return ResponseEntity.status(500).body(e.getMessage());
    }
}
