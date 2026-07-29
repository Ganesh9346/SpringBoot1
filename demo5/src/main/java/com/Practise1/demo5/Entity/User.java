package com.Practise1.demo5.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table(name = "users")
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userName;

    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles;
}
