package org.example;

import java.util.Arrays;
import java.util.Random;

public class Matrices_Ejercicio1 {

    static void main() {



        Random aleatorio = new Random();

        int filas = aleatorio.nextInt(6)+2;


        int matriz[][] = new int[filas][filas];

        for (int i=0;i< matriz.length;i++){
            for(int n=0;n<matriz[i].length;n++){

                matriz[i][n] = aleatorio.nextInt(50)+1;

            }
        }

        for (int fila[] : matriz){

            System.out.println(Arrays.toString(fila));
        }

        for (int i=0;i< matriz.length;i++){
            for (int n=0;n<matriz[i].length;n++){

                if (i==n){
                    System.out.print(matriz[i][n]+" ");
                }
            }
        }

        System.out.println();

        for (int i=0;i< matriz.length;i++){
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        for (int i=0;i< matriz.length;i++){
            for (int n=0;n<matriz[i].length;n++) {
             if (matriz.length-1 == (i+n)){
                 System.out.print(matriz[i][matriz.length - 1 - i] + " ");
             }
            }
        }
    }
}
