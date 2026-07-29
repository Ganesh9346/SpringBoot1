package com.example.OnlineVegApplication.controller;

import com.example.OnlineVegApplication.dto.SignInRequest;
import com.example.OnlineVegApplication.dto.SignUpRequest;
import com.example.OnlineVegApplication.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public String signup(@RequestBody SignUpRequest request){

        return authService.signup(request);

    }

    @PostMapping("/signin")
    public String signin(@RequestBody SignInRequest request){

        return authService.signin(request);

    }

}