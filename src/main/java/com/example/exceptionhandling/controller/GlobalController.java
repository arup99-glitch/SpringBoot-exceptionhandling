package com.example.exceptionhandling.controller;

import com.example.exceptionhandling.exception.AdminNotFoundException;
import com.example.exceptionhandling.exception.TraineeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalController {

    @ExceptionHandler({AdminNotFoundException.class, ArithmeticException.class,
            TraineeNotFoundException.class})
    public ResponseEntity<Object> returnNotFoundException(Exception ex) {
        if(ex instanceof AdminNotFoundException) {
            // Some operation
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        } else if(ex instanceof TraineeNotFoundException) {
            // Some operation for candidate not found
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        } else {
            // Some other operation
            return new ResponseEntity<>(ex.getMessage(),
                    HttpStatus.BAD_REQUEST);
        }
    }
}
