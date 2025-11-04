package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Vectores {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int vector[] = {0,10,13,15,26,30};
        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

        int vector2[] = new int[8];
        String vector2_string = vector2.toString();

        System.out.println(vector2_string);

        vector = vector2;

        vector[2] = 0;

        System.out.println(Arrays.toString(vector2));

        for(int i = 0; i<=vector.length; i++){
            System.out.println(vector[i]);
        }
    }
}
