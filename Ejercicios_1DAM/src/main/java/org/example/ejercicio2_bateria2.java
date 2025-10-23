package org.example;

import java.util.Scanner;

public class ejercicio2_bateria2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n = teclado.nextInt();

        for (int i = n; i >= 1 ; i-- ){
            System.out.println(i);
        }
    }
}
