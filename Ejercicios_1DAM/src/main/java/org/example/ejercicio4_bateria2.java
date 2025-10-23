package org.example;

import java.util.Scanner;

public class ejercicio4_bateria2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra = teclado.next();
        int letras = palabra.length();
        for (int i = letras-1 ;i >= 0 ;i-- ){
            System.out.println(palabra.charAt(i));
        }
    }
}
