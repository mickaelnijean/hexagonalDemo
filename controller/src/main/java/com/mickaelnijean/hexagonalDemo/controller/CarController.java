package com.mickaelnijean.hexagonalDemo.controller;

import com.mickaelnijean.hexagonalDemo.domain.model.Car;
import com.mickaelnijean.hexagonalDemo.domain.spi.CarDatabaseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="car")
public class CarController {
    
    private CarDatabaseRepository carDatabaseRepository;
    
    public CarController(CarDatabaseRepository carDatabaseRepository){
        this.carDatabaseRepository = carDatabaseRepository;
    }
    
    
    @GetMapping(path ="")
    public List<Car> getAllCars(){
        return this.carDatabaseRepository.getAllCars();
    }
}
