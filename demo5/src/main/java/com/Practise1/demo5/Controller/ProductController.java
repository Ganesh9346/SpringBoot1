package com.Practise1.demo5.Controller;

import com.Practise1.demo5.DTO.ProductUploadDTO;
import com.Practise1.demo5.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService ps;
    @PostMapping("/upload")
    public ResponseEntity<?> uploadProducts(@RequestBody ProductUploadDTO pdto){
        return new ResponseEntity<>(ps.uploadProductData(pdto),HttpStatus.OK);
    }
    @GetMapping("/listProducts")
    public ResponseEntity<List<?>> displayAll(){
        return new ResponseEntity<>(ps.displayComplete(),HttpStatus.OK);
    }
}
