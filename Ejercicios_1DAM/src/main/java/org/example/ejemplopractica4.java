package org.example;

import java.util.Scanner;

public class ejemplopractica4 {

     static void main() {
        Scanner teclado = new Scanner(System.in);
        int multiplicando = 0, multiplicador = 0;
        boolean valido;
        //Paso 1: Pedir el multiplicando
        do {
            valido = true; // reiniciamos el control
            try {
                System.out.print("Introduce el multiplicando (3 cifras): ");
                multiplicando = Integer.parseInt(teclado.nextLine());

                if (multiplicando < 100 || multiplicando > 999) {
                    System.out.println("El número debe tener exactamente 3 cifras.");
                    valido = false;
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Introduce solo números enteros.");
                valido = false;
            }
        } while (!valido);

        //Paso 2: Pedir el multiplicador
        do {
            valido = true;
            try {
                System.out.print("Introduce el multiplicador (3 cifras): ");
                multiplicador = Integer.parseInt(teclado.nextLine());

                if (multiplicador < 100 || multiplicador > 999) {
                    System.out.println("El número debe tener exactamente 3 cifras.");
                    valido = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduce solo números enteros.");
                valido = false;
            }
        } while (!valido);

        //Convertir a String para extraer las cifras del multiplicador
        String multStr = Integer.toString(multiplicador);
        int cifra3 = Integer.parseInt(multStr.substring(0, 1)); // centenas
        int cifra2 = Integer.parseInt(multStr.substring(1, 2)); // decenas
        int cifra1 = Integer.parseInt(multStr.substring(2, 3)); // unidades

        //Calcular resultados parciales
        int parcial1 = multiplicando * cifra1;
        int parcial2 = multiplicando * cifra2;
        int parcial3 = multiplicando * cifra3;
        int producto = multiplicando * multiplicador;

        //Mostrar el resultado
        System.out.println();
        System.out.println("El producto de la multiplicación es: " + producto);
        System.out.println("El proceso es:");
        System.out.println("   " + multiplicando);
        System.out.println(" x " + multiplicador);
        System.out.println(" -------");
        System.out.println("   " + parcial1);
        System.out.println("  " + parcial2 + "x");
        System.out.println(" " + parcial3 + "xx");
        System.out.println(" -------");
        System.out.println("  " + producto);

        teclado.close();
    }
}