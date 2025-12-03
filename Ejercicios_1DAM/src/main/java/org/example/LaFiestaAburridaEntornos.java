package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LaFiestaAburridaEntornos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        System.out.println("Cuantas personas vienen a saludarte?");
        try {
            numero = teclado.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Pon un número de personas");
        }
        String persona[] = new String[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print("Soy ");
            persona[i] = teclado.next();
        }

        for (int i = 0; i < numero; i++) {
            System.out.println("Hola "+persona[i]);
        }
    }

}
