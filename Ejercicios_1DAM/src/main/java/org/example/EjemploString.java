package org.example;

import java.util.Scanner;

public class EjemploString {
    static void main(){
        Scanner teclado = new Scanner(System.in);
        int numero = 435;


        String numero_string = Integer.toString(numero);

        String numero_medio = numero_string.substring(1,2);

        int numero_medio_int = Integer.parseInt(numero_medio);

        System.out.println("Resultado: " +numero_medio_int * numero);
    }
}
