package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BateriaVectores1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int resultado = 0;
        int vector[] = new int[8];
        for (int i = 0; i<vector.length;i++){
            vector[i] =random.nextInt(501);
            resultado+= vector[i];
        }
        System.out.println(Arrays.toString(vector));
        System.out.println(resultado);



    }
}

