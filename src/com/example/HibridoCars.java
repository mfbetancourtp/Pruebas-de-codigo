package com.example;
public class HibridoCars extends Coche {
    String combustion;
    Integer Capacidad ;

    public HibridoCars(){}

    public  HibridoCars(String combustion,Integer Capacidad,String color, String fabricante, String modelo, Double peso,Double large){
        super(color,fabricante,modelo,peso,large);
        this.combustion=combustion;
        this.Capacidad= Capacidad;
    }

    @Override
    public String toString() {
        return "HibridoCars{" +
                "combustion='" + combustion + '\'' +
                ", Capacidad=" + Capacidad +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", large=" + large +
                ", velocidad=" + velocidad +
                '}';
    }
}
