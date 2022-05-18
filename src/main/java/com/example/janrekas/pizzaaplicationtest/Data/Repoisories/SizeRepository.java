package com.example.janrekas.pizzaaplicationtest.Data.Repoisories;

import com.example.janrekas.pizzaaplicationtest.Data.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepository extends JpaRepository<Integer, SizeEntity> {
}
