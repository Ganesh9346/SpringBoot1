package com.example.OnlineVegApplication.Exception;

public class VegetableNotFoundException extends RuntimeException{
    public VegetableNotFoundException(String message){
        super(message);
    }
}
