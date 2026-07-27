package com.example.OnlineVegApplication.controller;

import com.example.OnlineVegApplication.entity.Farmer;
import com.example.OnlineVegApplication.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FarmerController {

    @Autowired
    FarmerService fs;
    @CrossOrigin
    @GetMapping("/farmers")
    public ResponseEntity<List<Farmer>> getFarmers(){

        return new ResponseEntity<>(fs.displayFarmers(), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/farmer")
    public ResponseEntity<?> addFarmer(@RequestBody Farmer farmer){

        return new ResponseEntity<>(fs.addFarmer(farmer),HttpStatus.OK);
    }

    @CrossOrigin
    @PutMapping("/farmer/{id}")
    public ResponseEntity<?> updateFarmer(@PathVariable int id,
                                          @RequestBody Farmer farmer){

        return new ResponseEntity<>(fs.updateFarmer(id,farmer),HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/farmer/{id}")
    public ResponseEntity<?> deleteFarmer(@PathVariable int id){

        return new ResponseEntity<>(fs.deleteFarmer(id),HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/farmer/{id}")
    public ResponseEntity<?> getFarmer(@PathVariable int id){

        return new ResponseEntity<>(fs.getFarmer(id),HttpStatus.OK);
    }

}