package com.exampleDTO.demo4.DTO;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ExceptionResponceDTO {
    private LocalDateTime timestamp;
    private int statuscode;
    private String error;
    private String message;
    private String path;

    public ExceptionResponceDTO(LocalDateTime timestamp, int statuscode, String error, String message, String path) {
        this.timestamp = timestamp;
        this.statuscode = statuscode;
        this.error = error;
        this.message = message;
        this.path = path;
    }
}
