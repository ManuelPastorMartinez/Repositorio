package org.example;

import java.util.Arrays;

public class EjemploArrays {
    static void main() {

        int array[] = {6,4,10,14};

        System.out.println(Arrays.toString(array));
        for (int i = 0; i< array.length-1;i++){
            for (int j = i + 1; j< array.length;j++){
                if (array[j]>array[i]){
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
            System.out.println(Arrays.toString(array));
        }

        int vector[] = {4,3,2,5,0};

        int vector2[] = vector.clone();
        Arrays.sort(vector2);

        System.out.println(Arrays.toString(vector2));
    }
}
