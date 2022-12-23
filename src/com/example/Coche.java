package com.example;
public class Coche {
        String color;
        String  fabricante;
        String modelo;
        Double peso;
        Double large;
        Integer velocidad=0;

    //constructores

    public Coche(){}
    public Coche(String color, String fabricante, String modelo, Double peso,Double large){
        this.color=color;
        this.fabricante= fabricante;
        this.modelo=modelo;
        this.peso=peso;
        this.large=large;

    }
//componentes

    public void acelerar(Integer velocidad){
        if (velocidad>=0&& velocidad <=120){
            this.velocidad+= velocidad;
        }
    }

    //ToString


    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }
}
