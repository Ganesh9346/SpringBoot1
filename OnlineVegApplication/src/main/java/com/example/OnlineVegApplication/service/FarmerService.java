package com.example.OnlineVegApplication.service;

import com.example.OnlineVegApplication.Exception.FarmerNotFoundException;
import com.example.OnlineVegApplication.entity.Farmer;
import com.example.OnlineVegApplication.repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {

    @Autowired
    FarmerRepository fr;

    public List<Farmer> displayFarmers(){
        return fr.findAll();
    }

    public Farmer addFarmer(Farmer farmer){
        return fr.save(farmer);
    }

    public Farmer updateFarmer(int id, Farmer farmer){

        Farmer f = fr.findById(id).orElse(null);

        if(f==null){
            throw new FarmerNotFoundException("Farmer not found");
        }

        f.setName(farmer.getName());
        f.setEmail(farmer.getEmail());
        f.setPhone(farmer.getPhone());
        f.setAddress(farmer.getAddress());

        return fr.save(f);
    }

    public String deleteFarmer(int id){

        Farmer f = fr.findById(id).orElse(null);

        if(f==null){
            throw new FarmerNotFoundException("Farmer not found");
        }

        fr.deleteById(id);

        return "Farmer Deleted Successfully";
    }

    public Farmer getFarmer(int id){

        Farmer f = fr.findById(id).orElse(null);

        if(f==null){
            throw new FarmerNotFoundException("Farmer not found");
        }

        return f;
    }

}