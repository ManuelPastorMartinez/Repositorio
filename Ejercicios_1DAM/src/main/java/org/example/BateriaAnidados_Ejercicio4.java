package org.example;

import java.util.Scanner;

public class BateriaAnidados_Ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        externo:
        for (int i=2;i<numero;i++){
            for (int n=2;n<i;n++){
                if ((i%n)==0){
                    continue externo;
                }
            }

            System.out.print(i+" ");
        }
    }
}
