package org.example;

import java.util.Scanner;

public class practica4 {

     static void main() {
        Scanner teclado = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        boolean control = true;
        //Paso 1: Pedir el primer número
        do {
            try {
                control = true;
                    System.out.print("Introduce un numero de 3 cifras: ");
                    numero1 = Integer.parseInt(teclado.nextLine());

                if (numero1 < 100 && numero1 > -100 || numero2 < 100 && numero2 > -100){
                    System.out.println("Pon un número de 3 cifras");
                    control = false;
                }

            } catch (Exception e) {
                System.out.println("Entrada no válida. Introduce solo números enteros.");
                control = false;
            }
        } while (control==false);

        //Paso 2: Pedir el segundo número
        do {
            control = true;
            try {
                System.out.print("Introduce otro número de 3 cifras: ");
                numero2 = Integer.parseInt(teclado.nextLine());

                if (numero2 > 999 && numero2 < -999 || numero1 > 999 && numero1 < -999) {
                    System.out.println("Pon un número de 3 cifras");
                    control = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduce solo números enteros.");
                control = false;
            }
        } while (control==false);

        //Convertir a String para extraer las cifras del segundo número
        String multStr = Integer.toString(numero2);
        int cifra3 = Integer.parseInt(multStr.substring(0, 1)); // centenas
        int cifra2 = Integer.parseInt(multStr.substring(1, 2)); // decenas
        int cifra1 = Integer.parseInt(multStr.substring(2, 3)); // unidades

        //Calcular el resultado total
        int total1 = numero1 * cifra1;
        int total2 = numero1 * cifra2;
        int total3 = numero1 * cifra3;
        int resultado = numero1 * numero2;

        //Mostrar el resultado
        System.out.println();
        System.out.println("El resultado de la multiplicación es: " + resultado);
        System.out.println("El proceso es:");
        System.out.println("   " + numero1);
        System.out.println(" x " + numero2);
        System.out.println(" -------");
        System.out.println("   " + total1);
        System.out.println("  " + total2 + "x");
        System.out.println(" " + total3 + "xx");
        System.out.println(" --------");
        System.out.println(" "+resultado);

        
    }
}





