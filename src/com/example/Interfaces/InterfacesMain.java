package com.example.Interfaces;

import com.example.Coche;

public class InterfacesMain {
    public static void main(String[] args) {

        Cocheservices newParametro= new CocheServicesClassImple();
        Cocheservices newParametros2 = new CocheServicesSportimpl();
        Coche coche22= newParametro.crearCocheDemo();
        Coche coche23= newParametros2.crearCocheDemo();

    }
}
