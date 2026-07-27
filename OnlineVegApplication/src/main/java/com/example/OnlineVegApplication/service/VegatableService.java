package com.example.OnlineVegApplication.service;

import com.example.OnlineVegApplication.Exception.VegetableNotFoundException;
import com.example.OnlineVegApplication.entity.vegatable;
import com.example.OnlineVegApplication.repository.VegatableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegatableService {
    @Autowired
    VegatableRepository vr;
    public List<vegatable> display_vegatables(){

        return vr.findAll();
    }

    public String uploaddata(vegatable v){
        vr.save(v);
        return "data saved";
    }

    public String update(int id, vegatable v2) {
        vegatable v1=vr.findById(id).orElse(null);
        if(v1==null){
            throw new RuntimeException("Item Not Found");
        }
        vr.save(v2);
        return "Update Successfully";

    }
    public String deleteItem(int id){
        vegatable v1=vr.findById(id).orElse(null);
        if(v1==null){
            throw new RuntimeException("Item Not Found");
        }
        vr.deleteById(id);
        return "Deleated Successfully";
    }
    public vegatable getVeg(int id) throws VegetableNotFoundException {
        vegatable v1=vr.findById(id).orElse(null);
        if(v1==null){
            throw new VegetableNotFoundException("Item that you searching is not found");
        }
        return v1;
    }
}
