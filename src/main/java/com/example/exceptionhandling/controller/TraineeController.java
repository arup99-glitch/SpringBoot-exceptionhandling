package com.example.exceptionhandling.controller;

import com.example.exceptionhandling.exception.AdminNotFoundException;
import com.example.exceptionhandling.model.Trainee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainee")
public class TraineeController {

    @GetMapping("/get-info/{id}")
    public ResponseEntity<Object> getTraineeInfo(@PathVariable Integer id) {
        if(id == 1001) {
            Trainee trainee = new Trainee(30067, "Arup Chakraborty",50,"arup.chakraborty@bjitacademy.com");
            return new ResponseEntity<>(trainee, HttpStatus.OK);
        } else {
            throw new AdminNotFoundException("trainee information" +
                    " not found");
        }
    }
    @GetMapping("/some-method")
    public ResponseEntity<Object> someMethod() {

        throw new ArithmeticException("Error");
    }
}
