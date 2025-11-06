package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BateriaVectores5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int vector[]=new int[6];


        System.out.println("Crea un nuevo vector");
        for (int i = 0; i< vector.length; i++){
            if (teclado.hasNextInt()){
                vector[i] = teclado.nextInt();
            }else {
                return;
            }
        }
        System.out.println(Arrays.toString(vector));
        int auxiliar = 0;
        auxiliar= vector[vector.length-1];

        for (int i = vector.length-1; i>= 1; i--){
            if (i == vector.length-1){
                auxiliar = vector[i];
                vector[i] = vector[i-1];
            }else {
                vector[i] = vector[i-1];
            }
        }
        vector[0] = auxiliar;
        System.out.println(Arrays.toString(vector));
    }
}
