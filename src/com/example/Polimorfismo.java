
package com.example;
public class Polimorfismo extends ElectricCars {

    public static void main(String[] args) {

        //h
        Coche newcars1= new HibridoCars();
        Coche newcars2= new ElectricCars();


        if(newcars1 instanceof  Coche){
            System.out.println("Soy un objeto de coche ");
        }
        if (newcars2 instanceof ElectricCars){
            System.out.println("Soy un objeto de ElectricCars");
        }


    }


}
