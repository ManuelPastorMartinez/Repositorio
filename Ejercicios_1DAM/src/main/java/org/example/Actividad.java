package org.example;

import java.util.Scanner;

public class Actividad {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?: ");
        String nombre = teclado.nextLine();

        System.out.println("¿A qué curso vas?");
        String curso = teclado.nextLine();

        System.out.println("Hola, " + nombre + ", bienvenid@ al curso " + curso);

        System.out.println("Introduce un número");
        int num1 = teclado.nextInt();

        System.out.println("Introduce otro número");
        int num2 = teclado.nextInt();

        int resultado = num1 + num2;
        System.out.println("El resultado es " + resultado);

    }
}
