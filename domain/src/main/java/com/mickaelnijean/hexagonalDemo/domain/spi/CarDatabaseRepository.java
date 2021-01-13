package com.mickaelnijean.hexagonalDemo.domain.spi;

import com.mickaelnijean.hexagonalDemo.domain.model.Car;

import java.util.List;

public interface CarDatabaseRepository {
    
    List<Car> getAllCars();
}
