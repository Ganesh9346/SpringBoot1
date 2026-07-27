package com.example.OnlineVegApplication.Exception;

public class FarmerNotFoundException extends RuntimeException{

    public FarmerNotFoundException(String message){
        super(message);
    }

}