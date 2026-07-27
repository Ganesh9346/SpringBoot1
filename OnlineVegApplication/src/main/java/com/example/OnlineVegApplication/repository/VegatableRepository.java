package com.example.OnlineVegApplication.repository;

import com.example.OnlineVegApplication.entity.vegatable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VegatableRepository extends JpaRepository<vegatable,Integer> {

}
