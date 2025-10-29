package org.example;

import java.util.Random;
import java.util.Scanner;

public class Random_ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);



        System.out.println("Cuál es el número mínimo");
        int numero_minimo = teclado.nextInt();

        System.out.println("Cuál es el número máximo");
        int numero_maximo = teclado.nextInt();

        if (numero_minimo>numero_maximo){
            System.out.println("El número mínimo no puede ser mayor que el máximo");

        }else {
            System.out.println("Cuantos números quieres");
            int numeros = teclado.nextInt();



            for (int i = 1; i<=numeros; i++){
                Random random = new Random();
                int aleatorio = random.nextInt(numero_maximo -numero_minimo + 1) + numero_minimo ;
                System.out.println(aleatorio);
            }

        }
    }
}
