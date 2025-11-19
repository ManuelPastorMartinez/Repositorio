package org.example;

import java.util.Arrays;
import java.util.Random;

public class Explicacion_Matrices {
    static void main() {
        Random aleatorio = new Random();
        int matriz[][] = {{0,1,2},{3,4,5},{6,7,8}};

        int matriz2[][]= new int[3][3];

        System.out.println(matriz[1][0]);
        System.out.println(matriz[2][1]);


        for (int i=0;i<matriz.length;i++){
            for (int n=0;n<matriz[0].length;n++){

                System.out.print(matriz[i][n]);

            }

            System.out.println();
        }

        for (int fila[] : matriz){
            for (int columna : fila){
                System.out.print(columna);
            }
            System.out.println();
        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }
        int vector[] = {1,2,3,4};
        for (int num : vector){
            System.out.println(num);
        }



        int filas = aleatorio.nextInt(6)+2;


        int matriz3[][] = new int[filas][filas];

        for (int i=0;i< matriz3.length;i++){
            for(int n=0;n<matriz3[i].length;n++){

                matriz3[i][n] = aleatorio.nextInt(50)+1;

            }
        }

        for (int fila[] : matriz3){

            System.out.println(Arrays.toString(fila));
        }
    }
}
