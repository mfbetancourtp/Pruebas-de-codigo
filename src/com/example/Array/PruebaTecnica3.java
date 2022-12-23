package com.example.Array;
import java.util.Scanner;

public class PruebaTecnica3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        int x = scan.nextInt();

        if (x == 0) {
            System.out.println("El valor de x es 0.");
            return;
        }

        System.out.print("Ingrese el valor de n: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("_");
            } else {
                System.out.print("X");
            }
        }

        scan.close();
    }
}
