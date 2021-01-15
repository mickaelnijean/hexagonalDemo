package com.mickaelnijean.hexagonalDemo.persistence.repository;

import com.mickaelnijean.hexagonalDemo.persistence.model.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDatabaseJpaRepository extends JpaRepository<UserJpa, String> {
}
