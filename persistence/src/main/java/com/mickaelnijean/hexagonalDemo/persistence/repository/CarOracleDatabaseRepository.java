package com.mickaelnijean.hexagonalDemo.persistence.repository;

import com.mickaelnijean.hexagonalDemo.domain.model.Car;
import com.mickaelnijean.hexagonalDemo.domain.spi.CarDatabaseRepository;
import com.mickaelnijean.hexagonalDemo.persistence.mapper.CarMapper;
import com.mickaelnijean.hexagonalDemo.persistence.model.CarJpa;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CarOracleDatabaseRepository implements CarDatabaseRepository {

    private CarDatabaseJpaRepository carDatabaseJpaRepository;
    private CarMapper carMapper;
    
    public CarOracleDatabaseRepository(CarDatabaseJpaRepository carDatabaseJpaRepository,
                                       CarMapper carMapper){
        this.carDatabaseJpaRepository = carDatabaseJpaRepository;
        this.carMapper = carMapper;
    }
    
    @Override
    public List<Car> getAllCars(){
        List<CarJpa> allJpa = this.carDatabaseJpaRepository.findAll();
        return this.carMapper.mapToDomain(allJpa);
    }
}
