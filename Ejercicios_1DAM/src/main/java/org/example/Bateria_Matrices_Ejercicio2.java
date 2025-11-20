package org.example;

import java.util.Arrays;
import java.util.Random;

public class Bateria_Matrices_Ejercicio2 {
    static void main() {

        Random aleatorio = new Random();

        int matriz[][] = new int[aleatorio.nextInt(5)+1][aleatorio.nextInt(5)+1];
        System.out.println("Matriz: ");
        for (int i=0;i< matriz.length;i++){
            for(int n=0;n<matriz[i].length;n++){
                matriz[i][n] = aleatorio.nextInt(50)+1;

            }
        }
        for (int fila[]:matriz){
            for (int num : fila){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma = 0;
            for (int n = 0; n < matriz[i].length; n++) {
                suma+=matriz[i][n];
            }

            System.out.println("Fila "+(i+1)+": "+suma);
        }

        for (int i = 0; i < matriz[0].length; i++) {
            suma = 0;
            for (int n = 0; n < matriz.length; n++) {
                suma+= matriz[n] [i];
            }
            System.out.println("Columna "+(i+1)+": "+suma);
        }

        suma = 0;
        int fila = aleatorio.nextInt(matriz.length-1);
        for (int i = 0; i < matriz[0].length; i++) {
            suma += matriz[fila][i];
        }

        System.out.println("1 fila: "+ suma);



    }
}
