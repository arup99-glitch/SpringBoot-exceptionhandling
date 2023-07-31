package com.example.exceptionhandling.controller;

import com.example.exceptionhandling.exception.AdminNotFoundException;
import com.example.exceptionhandling.model.Admin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/get-info/{id}")
    public ResponseEntity<Object> getAdminInfo(@PathVariable Integer id){
        if(id==2001){

            Admin admin = new Admin("Hello form Admin pannel");
            return new ResponseEntity<>(admin, HttpStatus.OK);
        }else {
            throw new AdminNotFoundException("Admin not found");
        }

    }
    @GetMapping("/some-method")
    public ResponseEntity<Object> someMethod() {

        throw new ArithmeticException("Error");
    }
}
