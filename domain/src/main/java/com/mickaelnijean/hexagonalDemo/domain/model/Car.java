package com.mickaelnijean.hexagonalDemo.domain.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Car {
    
    private Long id;
    private Color color;
}
