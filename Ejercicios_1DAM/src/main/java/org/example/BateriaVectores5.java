package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BateriaVectores5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int vector[]=new int[6];
        int auxiliar = 0;

        System.out.println("Crea un nuevo vector");
        for (int i = 0; i< vector.length; i++){
            if (teclado.hasNextInt()){
                vector[i] = teclado.nextInt();
            }else {
                return;
            }
        }
        System.out.println(Arrays.toString(vector));

        auxiliar = vector[0];
        vector[0]= vector[vector.length-1];
        for (int i = vector.length-1; i>= 1; i--){
            if (i == vector.length-1){
                vector[i] = auxiliar;
            }else {
                vector[i] = vector[i-1];
            }
        }
        System.out.println(Arrays.toString(vector));

    }
}
