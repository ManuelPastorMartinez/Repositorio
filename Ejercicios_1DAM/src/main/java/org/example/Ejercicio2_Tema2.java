package org.example;

import java.util.Scanner;

public class Ejercicio2_Tema2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame una palabra");
        String palabra1 = teclado.nextLine();
        int tamano1 = palabra1.length();

        System.out.println("Dame otra palabra");
        String palabra2 = teclado.nextLine();
        int tamano2 = palabra2.length();

        if (tamano1 > tamano2) {
            System.out.println(palabra1 + " tiene más letras que " + palabra2);
        } else if (tamano2 > tamano1) {
            System.out.println(palabra1 + " tiene menos letras que " + palabra2);
        }else {
            System.out.println(palabra1 + " y " + palabra2 + " tienen las mismas palabras");
        }
    }
}
