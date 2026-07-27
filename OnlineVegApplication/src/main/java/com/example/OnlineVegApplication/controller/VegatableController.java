package com.example.OnlineVegApplication.controller;

import com.example.OnlineVegApplication.Exception.VegetableNotFoundException;
import com.example.OnlineVegApplication.entity.vegatable;
import com.example.OnlineVegApplication.service.VegatableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VegatableController {
    @Autowired
    VegatableService vs;
    @CrossOrigin
    @GetMapping("/get")
    public ResponseEntity<List<vegatable>> display(){
        return new ResponseEntity<>(vs.display_vegatables(),HttpStatus.OK);
    }
    @PostMapping("/post")
    @CrossOrigin
    public ResponseEntity<?> uploadVegetables(@RequestBody vegatable v){
        return new ResponseEntity<>(vs.uploaddata(v),HttpStatus.OK);
    }
    @PutMapping("/put/{id}")
    @CrossOrigin
    public ResponseEntity<?> updateVegetable(@RequestBody vegatable v, @PathVariable int id){
        return new ResponseEntity<>(vs.update(id,v),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    @CrossOrigin
    public ResponseEntity<?> deleteItem(@PathVariable int id){
        return new ResponseEntity<>(vs.deleteItem(id),HttpStatus.OK);
    }
    @GetMapping("/getVegetable/{id}")
    @CrossOrigin
    public ResponseEntity<?> getVegetable(@PathVariable int id){
        return new ResponseEntity<>(vs.getVeg(id), HttpStatus.OK);
    }
}
