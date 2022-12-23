package com.example.Array;
import java.util.Scanner;
public class Test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de X: ");
        int x = scanner.nextInt();

        if ((x == 0) ) {
            System.out.println("El valor de X es 0 o nulo");
        } else {
            for (int i = 0; i < x; i++) {
                // validar el valor de cada espacio con "–" y "X" respectivamente
                if (i % 2 == 0) {
                    System.out.print("–");
                } else {
                    System.out.print("X");
                }
            }
        }

    }

}
