package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BateriaVectores6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un vector");
        int vector[] = new int[6];

        for (int i = 0; i<vector.length; i++){
            if (teclado.hasNextInt()){
                vector[i] = teclado.nextInt();
            }else {
                return;
            }
        }
        System.out.println(Arrays.toString(vector));

        for(int i = 0; i<vector.length/2; i++){
            if (vector[i]==vector[vector.length-1-i]){
                System.out.println("Es palindromo");
                break;
            }else {
                System.out.println("No es palindromo");
                break;
            }
        }
    }
}
