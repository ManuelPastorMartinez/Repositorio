package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BateriaVectores9 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce 5 palabras");
        String vector[] = new String[5];

        for (int i = 0; i<vector.length; i++){
            vector[i]=teclado.nextLine();
        }
        System.out.println(Arrays.toString(vector));

    }
}
