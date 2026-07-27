package com.exampleDTO.demo4.service;

//import com.mohit.demo.StudentServer.Entity.User;
//import com.mohit.demo.StudentServer.Repository.UserRepository;
import com.exampleDTO.demo4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        com.exampleDTO.demo4.entity.User user = userRepository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found: " + username));
        return org.springframework.security.core.userdetails.User.withUsername(user.getUserName())
                .password(user.getPassword())
                .roles(user.getRoles().toArray(new String[0]))
                .build();
    }
}