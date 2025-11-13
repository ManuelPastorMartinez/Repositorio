package org.example;

import java.util.Arrays;

public class ActividadEliminarArrays {
    static void main() {
        int vector[] = {1,2,2,3,4,5,5,6,6};


        int tam = 0;

        int aux[] = new int[vector.length];

        for (int i = 0;i<= vector.length-1;i++) {

            if (i == vector.length-1){
                aux[i] = vector[i];
                tam++;
            }else if (vector[i] != vector[i+1]){
                aux[i] = vector[i];
                tam++;
            }

        }
        System.out.println(Arrays.toString(aux));
        System.out.println(tam);

        int limpio[] = new int [tam];
        int j = 0;
        for (int i = 0; i<aux.length;i++){

            if (aux[i] != 0){
                limpio[j] = aux[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(limpio));
    }
}
