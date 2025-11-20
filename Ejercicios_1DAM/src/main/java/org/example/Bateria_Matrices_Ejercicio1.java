package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Bateria_Matrices_Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Matriz: ");

        int matriz[][] = new int[3][3];

        for (int i=0;i< matriz.length;i++){
            for (int n=0;n<matriz[i].length;n++){
                matriz[i][n] = teclado.nextInt();
            }
        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }

        System.out.print("Número a buscar: ");
        int numero = teclado.nextInt();

        externo:
        for (int i=0;i<matriz.length;i++){
            interno:
            for (int n=0;n< matriz[i].length;n++){
                if (matriz[i][n]==numero){
                    System.out.println("El número "+numero+" se encuentra en la posición ("+i+", "+n+")." );
                    break externo;
                }else {
                    System.out.println("El número "+numero+" no se encuentra en la matríz");
                    break externo;
                }
            }
        }

    }
}
