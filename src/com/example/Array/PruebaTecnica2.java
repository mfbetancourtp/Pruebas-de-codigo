package com.example.Array;

public class PruebaTecnica2 {
    public static void main(String[] args) {
        int[] numeros = new int[] { 28, 50, 40, 200, 20, 44, 100, 153 };

        int maximo = numeros[0];
        int indice = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
                indice = i;
            }
        }

        System.out.println("El número mayor  es " + maximo + " y se encuentraen el indice " + indice);

    }
}
