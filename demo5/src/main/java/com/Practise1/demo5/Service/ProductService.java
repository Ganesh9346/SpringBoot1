package com.Practise1.demo5.Service;

import com.Practise1.demo5.DTO.ProductUploadDTO;
import com.Practise1.demo5.Entity.Product;
import com.Practise1.demo5.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository pr;
    public String uploadProductData(ProductUploadDTO pdto){
        Product p=maptoProduct(pdto);
        pr.save(p);
        return "data saved successfully";
    }
    public List<Product> displayComplete(){
        List<Product> p= pr.findAll();
        return p;
    }

    private Product maptoProduct(ProductUploadDTO pdto) {
        Product p1=new Product();
        p1.setProductName(pdto.getProductName());
        p1.setDescription(pdto.getDescription());
        p1.setCost(pdto.getCost());
        return p1;
    }
}
