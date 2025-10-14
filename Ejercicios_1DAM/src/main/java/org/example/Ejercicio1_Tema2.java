package org.example;

import java.util.Scanner;

public class Ejercicio1_Tema2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame una frase");

        String texto = teclado.nextLine();
        System.out.println(texto);

        int tamano =texto.length();
        System.out.println(tamano);

        String reemplazo_espacios = texto.replace(" ", "");
        System.out.println(reemplazo_espacios);

        int TamanoMitad = tamano/2;
        String TrozoTexto = texto.substring(0, TamanoMitad);
        String TrozoTexto2 = texto.substring(TamanoMitad);
        System.out.println("Primera mitada del texto es "+TrozoTexto+" y la segunda mitad del texto es "+TrozoTexto2);

        String TextoMayusculas = texto.toUpperCase();
        System.out.println(TextoMayusculas);

    }
}

