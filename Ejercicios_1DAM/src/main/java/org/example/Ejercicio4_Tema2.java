package org.example;

import java.util.Scanner;

public class Ejercicio4_Tema2 {
    static void main(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame una frase que tenga palabras que se repitan");
        String texto = teclado.nextLine();

        System.out.println("Dime la palabra de la frase que más se repita");
        String palabra = teclado.nextLine();

        int texto_tamano = texto.length();
        int palabra_tamano = palabra.length();

        String frase_sin = texto.replace(palabra, "");
        int conteo = frase_sin.length();

        int resta = texto_tamano - conteo;
        int resultado = resta /palabra_tamano;
        System.out.println(resultado);


    }
}
