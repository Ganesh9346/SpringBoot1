package com.example.OnlineVegApplication.service;

import com.example.OnlineVegApplication.dto.SignInRequest;
import com.example.OnlineVegApplication.dto.SignUpRequest;
import com.example.OnlineVegApplication.entity.User;
import com.example.OnlineVegApplication.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AuthRepository authRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    public String signup(SignUpRequest request) {

        if (authRepository.findByUserName(request.getUserName()).isPresent()) {

            throw new RuntimeException("Username Already Exists");

        }

        User user = new User();

        user.setUserName(request.getUserName());

        user.setPassword(
                passwordEncoder.encode(request.getPassword())
        );

        authRepository.save(user);

        return "Signup Successful";

    }

    public String signin(SignInRequest request) {

        authenticationManager.authenticate(

                new UsernamePasswordAuthenticationToken(

                        request.getUserName(),

                        request.getPassword()

                )

        );

        return "Login Successful";

    }

}