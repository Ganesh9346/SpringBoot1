package com.example.OnlineVegApplication.service;

import com.example.OnlineVegApplication.entity.User;
import com.example.OnlineVegApplication.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AuthRepository authRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = authRepository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found"));

        return org.springframework.security.core.userdetails.User
                .builder()
                .username(user.getUserName())
                .password(user.getPassword())
                .roles("USER")
                .build();
    }
}