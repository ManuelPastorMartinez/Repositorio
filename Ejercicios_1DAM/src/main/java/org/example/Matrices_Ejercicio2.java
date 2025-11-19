package org.example;

import java.util.Arrays;
import java.util.Random;

public class Matrices_Ejercicio2 {

    static void main() {


        Random aleatorio = new Random();

        int filas_matriz1 = aleatorio.nextInt(6) + 2;

        int matriz1[][] = {{1,2,3,4},{5,4,6,7},{6,9,10,12}};

        int matriz2[][] = {{12,21,2,1},{50,1,2,3},{19,0,2,4}};

        int matriz3[][] = new int[3][4];

        for (int i=0;i<matriz1.length;i++){
            for (int n=0;n<matriz1[i].length;n++){

                if (matriz1[i][n]>matriz2[i][n]){
                    matriz3[i][n] = matriz1[i][n];
                }else {
                    matriz3[i][n] = matriz2[i][n];
                }
            }
        }

        for (int fila[]:matriz3){
            System.out.println(Arrays.toString(fila));
        }

    }
}