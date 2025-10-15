package org.example;

import java.util.Scanner;

public class Ejercicio3_Tema2 {
    static void main(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta un número...");
        int numero = teclado.nextInt();
        System.out.println("¿Cuántas cifras quieres eliminar?");
        int quitar = teclado.nextInt();

        String numero_string = Integer.toString(numero);
        int tamano = numero_string.length();
        int nuevo_tamano = tamano - quitar;

        String resultado = numero_string.substring(0, nuevo_tamano);
        System.out.println("El resultado es " + resultado);

    }
}
