package com.example.OnlineVegApplication.repository;

import com.example.OnlineVegApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUserName(String userName);

}