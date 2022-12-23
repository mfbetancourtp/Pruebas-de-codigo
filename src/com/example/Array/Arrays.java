package com.example.Array;

public class Arrays {

    public static void main(String[] args) {


        Integer number= 50;
        //Arrays de String
        String[] primerArray= new String[3];


        primerArray[0]="Hola";
        primerArray[1]="Primero";
        primerArray[2]= "segundo";


        for( int i=0; i< primerArray.length;i++){
            System.out.println(primerArray[i]);
        }


        Integer[] numeroArrays= new Integer[4];

        numeroArrays[2]=2;
        numeroArrays[1]=1;
        numeroArrays[0]=5;
        numeroArrays[3]=6;


        for (int e =0; e< numeroArrays.length;e++){
            System.out.println(numeroArrays[e]);
        }
        String name = "primer nombre";
        String last = " last name";
        String[] sindefinirlongitud= new String[]{name,last};

         for(int a = 0; a< sindefinirlongitud.length;a++){
             System.out.println(sindefinirlongitud[a]);
         }


    }
}
