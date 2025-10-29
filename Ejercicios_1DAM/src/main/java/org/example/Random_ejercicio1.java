package org.example;

import java.util.Random;

public class Random_ejercicio1 {
    static void main() {

        Random random = new Random();
        int numero1 = random.nextInt(6)+1;
        System.out.println(numero1);

        int numero2 = random.nextInt(6)+1;
        System.out.println(numero2);

        int resultado = numero1 + numero2;
        System.out.println("El resultado es "+resultado);
    }
}
