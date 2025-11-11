package org.example;

import java.util.Scanner;

public class Ampliacion_Split {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta palabra a imprimir...");
        String palabra = teclado.next();
        teclado.nextLine();
        String letras_vector[] = palabra.split("");

        System.out.println("Inserta la cantidad de letras a imprimir...");
        String cantidad = teclado.nextLine();
        String cantidad_vector[] = cantidad.split(" ");

        if (letras_vector.length == cantidad_vector.length){

            for (int i = 0;i<letras_vector.length;i++){

                for (int n = 0;n <Integer.parseInt(cantidad_vector[i]);n++){

                    System.out.print(letras_vector[i]);
                }
            }



        }else {
            System.out.println("Las palabras y las cifras introducidas no coinciden.");
        }
    }
}
