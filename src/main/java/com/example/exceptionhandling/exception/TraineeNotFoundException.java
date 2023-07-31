package com.example.exceptionhandling.exception;

public class TraineeNotFoundException extends RuntimeException {
    public TraineeNotFoundException(String message){
        super(message);
    }

}
