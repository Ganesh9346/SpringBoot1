package com.Practise1.demo5.Repository;

import com.Practise1.demo5.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
