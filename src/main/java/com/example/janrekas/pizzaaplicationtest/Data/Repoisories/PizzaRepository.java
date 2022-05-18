package com.example.janrekas.pizzaaplicationtest.Data.Repoisories;

import com.example.janrekas.pizzaaplicationtest.Data.PizzaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Integer, PizzaEntity> {
}
