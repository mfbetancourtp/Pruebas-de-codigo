package com.example.Array;

public class PruebaTecnica {

    public static void main(String[] args) {

        int arr[] = new int[]{1,2,1,3,3,1,2,1,5,1};
        int test = arr.length;

        boolean visited[] = new boolean[test];


        for (int i = 1; i <= 5; i++) {
            int count = 0;

            for (int j = 0; j < test; j++) {

                if (visited[j] == true)
                    continue;

                if (arr[j] == i) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.print(i + ": " );
            for (int k = 0; k < count; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
