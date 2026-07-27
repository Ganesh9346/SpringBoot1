package com.example.OnlineVegApplication.repository;

import com.example.OnlineVegApplication.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepository extends JpaRepository<Farmer,Integer> {

}