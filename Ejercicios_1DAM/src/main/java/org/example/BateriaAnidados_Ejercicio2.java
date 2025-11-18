package org.example;

import java.util.Scanner;

public class BateriaAnidados_Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una altura para la pirámide");
        int altura = teclado.nextInt();


        for (int i = 1;i<altura;i++){

            for (int n = 1;n<=i;n++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
