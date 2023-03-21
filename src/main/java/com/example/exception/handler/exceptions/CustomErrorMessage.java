package com.example.exception.handler.exceptions;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
@Data
public class CustomErrorMessage {
    private int statusCode;
    private LocalDateTime timestamp;
    private String message;
    private String description;

    public CustomErrorMessage(
            int statusCode,
            LocalDateTime timestamp,
            String message,
            String description) {

        this.statusCode = statusCode;
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
    }
}
