package com.exampleDTO.demo4.Exception;

import com.exampleDTO.demo4.DTO.ExceptionResponceDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionResponceDTO> handleRunExcutionException(RuntimeException e, HttpServletRequest req){
        ExceptionResponceDTO exceptionResponseDTO = new ExceptionResponceDTO(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                e.getMessage(),
                req.getRequestURI()
        );
        return ResponseEntity.status(500).body(exceptionResponseDTO);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(5000).body(e.getMessage());

    }
}
