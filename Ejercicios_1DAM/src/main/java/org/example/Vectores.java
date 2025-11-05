package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vectores {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        Random random = new Random();
        int vector[] = {0,10,13,15,26,30};
        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

        int vector2[] = new int[8];

        vector2[4] = 10;

        vector2[6] = 14;

        System.out.println(Arrays.toString(vector2));

        for (int i = 0;i< vector2.length;i++){
            System.out.println("Numero: "+i+": "+vector2[i]);
        }

        int vector3[] = new int[8];

        vector3 =vector.clone();

        System.out.println(Arrays.toString(vector3));

        for (int i = 0; i<vector3.length;i++){
            vector3[i]=random.nextInt(501);
        }
        System.out.println(Arrays.toString(vector3));

        int vector4[] = new int[4];

        for (int i = 0;i<vector4.length;i++){
            if (teclado.hasNextInt()){
                vector4[i] = teclado.nextInt();
            }
        }
        System.out.println(Arrays.toString(vector4));
    }
}
