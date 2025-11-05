package org.example;

import java.util.Arrays;

public class BateriaVectores2 {
    static void main() {

        int vector[] = {1,4,6,4,8,5};
        int aux = 0;

        for (int i = 0; i<vector.length/2;i++){

            aux = vector[i];
            vector[i]=vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;
        }
        System.out.println(Arrays.toString(vector));
    }
}
