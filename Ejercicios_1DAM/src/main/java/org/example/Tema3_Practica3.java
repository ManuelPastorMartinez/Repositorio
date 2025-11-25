package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
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
            String matriz[][]= new String[altura][anchura];

            System.out.println("Introduce (línea a línea) los colores de tu imagen para píxel: ");
            for (int i = 0; i < matriz.length; i++  ) {
                String letras = teclado.next();
                String vector[] = letras.split("");
                if (letras.matches("[a-oA-O]+") && vector.length==anchura){
                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = vector[j];
                    }
                }else{
                    System.out.println("Has introducido un valor de píxel incorrecto (A-O)");
                    i--;
                }
            }

            for (String fila[]:matriz){
                System.out.println(Arrays.toString(fila));
            }


            int contador = 0;

            for (int i=0;i< matriz.length;i++){
                String color1="";
                String color2 ="";


            }

        }else {
            System.out.println("Resolución incorrecta (tiene que ser múltiplo de 8 y como máximo de 48)");
        }
    }
}
