package org.example;

import java.util.Scanner;

public class Tema3_Practica3 {
    static void main() {

        Scanner teclado =new Scanner(System.in);


        System.out.println("******* VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM *******");
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");
        System.out.println("Ancho:");
        int anchura = teclado.nextInt();
        System.out.println("Alto: ");
        int altura = teclado.nextInt();

        if (altura % 8 == 0 && anchura % 8 == 0 && altura<=48 && anchura<=48){
            final int BLOQUE = anchura/2;

            String matriz[][]= new String[anchura][altura];

            System.out.println("Introduce (línea a línea) los colores de tu imagen para píxel: ");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[j][0] = teclado.next();
                }

            }

        }else {
            System.out.println("Resolución incorrecta (tiene que ser múltiplo de 8 y como máximo de 48)");
        }
    }
}
