package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3_Practica2 {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String numero_propio = teclado.next();
        boolean estado = true;

        System.out.println("Introduce los números de tu loteria (formato  N-N-N-N-N-N/R)");


        boolean numero_propio_string = numero_propio.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d-");

        int numero_ganador[]=new int[6];
        int reintegro[] = new int[1];
        while (estado) {
            for (int i = 0; i < numero_ganador.length; i++) {
                numero_ganador[i] = random.nextInt(49) + 1;
                if (i != numero_ganador.length - 1 && numero_ganador[i] == numero_ganador[i + 1]) {

                }
            }
        }
        Arrays.sort(numero_ganador);
        System.out.println("El número del premio es: "+ Arrays.toString(numero_ganador));
    }
}
