package com.cg.carrentals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.carrentals.entity.RentalCar;

public interface RentalCarRepository extends JpaRepository<RentalCar,Integer>{
}