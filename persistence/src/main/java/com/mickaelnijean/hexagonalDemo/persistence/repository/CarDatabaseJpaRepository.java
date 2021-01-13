package com.mickaelnijean.hexagonalDemo.persistence.repository;

import com.mickaelnijean.hexagonalDemo.persistence.model.CarJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDatabaseJpaRepository extends JpaRepository<CarJpa, Long> {
}
