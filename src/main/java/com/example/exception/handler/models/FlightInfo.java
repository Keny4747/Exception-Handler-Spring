package com.example.exception.handler.models;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightInfo {

    @Min(1)
    private long id;

    private String from;

    private String to;

    private String gate;
}
