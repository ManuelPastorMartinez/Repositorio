package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BateriaVectores10 {
    static void main() {

        String palabras[] = {"mandarina", "jacobo", "melocotón","melon"};

        Scanner teclado = new Scanner(System.in);
        System.out.println(Arrays.toString(palabras));

        System.out.println("Introduce una letra (incial)...");

        char letra = teclado.next().charAt(0);

        for (int i = 0; i< palabras.length;i++){
            if (letra == palabras[i].charAt(0)){
                System.out.println(palabras[i]);
            }
        }
    }
}
