package com.example.mcountingminutes.repository;

import com.example.mcountingminutes.model.entity.CountingMinutesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountingMinutesRepository extends JpaRepository<CountingMinutesEntity, String> {
}
