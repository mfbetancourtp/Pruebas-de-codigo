package com.example;
public class CocheMain {
    public static void main(String[] args) {
        Coche NewCar = new Coche("black", "BMW", "2022",150.10,1.5);



        NewCar.acelerar(50);



        NewCar.peso=200.20;


        ElectricCars newCoche= new ElectricCars();
        newCoche.motorElectrico= "solo es prueba";
        newCoche.peso=30.20;
        newCoche.color="white";
        newCoche.modelo="tesla";

        //System.out.println(newCoche);

        ElectricCars Carss= new ElectricCars("v.18","yellow","Porshe","911", 201.10,25.2);

        //System.out.println(Carss);

        Carss.acelerar(50);

        //System.out.println(Carss);

        HibridoCars firsName= new HibridoCars("gas",4, "blue", "Toyota", "XT",500.02, 5.20 );

        firsName.color="black";


        System.out.println(firsName);



    }
}