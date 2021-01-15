package com.mickaelnijean.hexagonalDemo.controller;

import com.mickaelnijean.hexagonalDemo.domain.model.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="user")
public class UserController {
    
    @GetMapping(path ="")
    public boolean getAllCars(){
        return true;
    }
}
