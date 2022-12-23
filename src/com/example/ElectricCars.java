package com.example;
public class ElectricCars extends Coche {

    String motorElectrico;

    public ElectricCars(){}
    public  ElectricCars(String motorElectrico){

        this.motorElectrico=motorElectrico;
    }
    public  ElectricCars(String motorElectrico,String color, String fabricante, String modelo, Double peso,Double large){
        super(color,fabricante,modelo,peso, large );
        this.motorElectrico=motorElectrico;
    }

    @Override
    public void acelerar(Integer velocidad) {
        super.acelerar(velocidad*2);
    }

    @Override
    public String toString() {
        return "ElectricCars{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", large=" + large +
                ", velocidad=" + velocidad +
                '}';
    }
}
