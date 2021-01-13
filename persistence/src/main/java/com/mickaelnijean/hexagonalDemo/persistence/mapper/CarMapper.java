package com.mickaelnijean.hexagonalDemo.persistence.mapper;

import com.mickaelnijean.hexagonalDemo.domain.model.Car;
import com.mickaelnijean.hexagonalDemo.persistence.model.CarJpa;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class CarMapper {
    
    public List<Car> mapToDomain(List<CarJpa> allJpa){
        return allJpa.stream()
                .map(this::mapToDomain)
                .collect(toList());
    }
    
    private Car mapToDomain(CarJpa allJpa1){
        return Car.builder()
                       .id(allJpa1.getId())
                       .color(allJpa1.getColor())
                       .build();
    }
}
