package com.exampleDTO.demo4.repository;

import com.exampleDTO.demo4.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PeopleRepository extends JpaRepository<People,Integer> {
    Optional<People> findByUsername(String username);
}