package com.example.exception.handler.exceptions;

public class FlightNotFoundException extends RuntimeException{

    public FlightNotFoundException(String message){
        super(message);
    }
}
