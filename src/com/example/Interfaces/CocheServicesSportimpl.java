package com.example.Interfaces;

import com.example.Coche;
import com.example.ElectricCars;

public class CocheServicesSportimpl implements Cocheservices{
    @Override
    public Coche crearCocheDemo() {
        System.out.println("desdeCoche Sport");
        return new ElectricCars();
    }
}
