package com.Practise1.demo5.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer productId;
    String productName;
    String description;
    Integer cost;
    public Product(){

    }

    public Product(Integer productId, String productName, String description, Integer cost) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.cost = cost;
    }
}
