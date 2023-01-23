package com.example.testdocker.repo;

import com.example.testdocker.model.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepo extends JpaRepository<Entity, Integer> {
}
