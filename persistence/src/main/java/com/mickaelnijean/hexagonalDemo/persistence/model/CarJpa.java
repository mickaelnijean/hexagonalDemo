package com.mickaelnijean.hexagonalDemo.persistence.model;

import com.mickaelnijean.hexagonalDemo.domain.model.Color;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "CAR")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarJpa {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "COLOR")
    private Color color;
    
}
