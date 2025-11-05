package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BateriaVectores4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int posicion = 0;
        int vector[] = new int[8];

        System.out.println("Introduce un vector");
        for (int i = 0;i<vector.length;i++){
            if (teclado.hasNextInt()){
                vector[i]= teclado.nextInt();
            }else {
                return;
            }
        }
        System.out.println(Arrays.toString(vector));

        System.out.print("Introduce una posición para eliminarla: ");
        if (teclado.hasNextInt()){
            posicion=teclado.nextInt();
        }else {
            System.out.println("Introduce un número válido");
        }
        int nuevo_vector[]=new int[vector.length-1];

        for (int i= 0;i<nuevo_vector.length;i++){
            if(vector[i]>=posicion){
                nuevo_vector[i]=vector[i+1];
            }else {
                nuevo_vector[i]=vector[i];
            }
        }
        System.out.println(Arrays.toString(nuevo_vector));
    }
}
