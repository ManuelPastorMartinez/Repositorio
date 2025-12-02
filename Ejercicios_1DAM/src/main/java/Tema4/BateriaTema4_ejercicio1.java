package Tema4;

import java.util.Scanner;

public class BateriaTema4_ejercicio1 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = teclado.nextInt();
        int resultado = funcion(numero);
        System.out.println(resultado);
    }

    public static int funcion(int numero){

        return numero*numero*numero;
    }
}
