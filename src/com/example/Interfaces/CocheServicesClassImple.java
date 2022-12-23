package com.example.Interfaces;

import com.example.Coche;
import com.example.ElectricCars;

public class CocheServicesClassImple implements Cocheservices {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Estoy devolviendo de aqui");
        return new ElectricCars();
    }
}
