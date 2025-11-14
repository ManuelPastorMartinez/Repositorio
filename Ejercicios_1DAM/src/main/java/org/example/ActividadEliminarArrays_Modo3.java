package org.example;

import java.util.Arrays;
import java.util.Random;

public class ActividadEliminarArrays_Modo3 {
    static void main() {

        Random aleatorio = new Random();

        int numeros[] = new int[10];

        boolean estado = true;

        for (int i = 0;i<numeros.length;i++){
            numeros[i] = aleatorio.nextInt(10)+1;
        }
        System.out.println(Arrays.toString(numeros));



        while (estado){

            estado = false;
            Arrays.sort(numeros);

            for (int i = 0; i<numeros.length;i++){
                if (i!= numeros.length-1 && numeros[i] == numeros[i+1]){
                    System.out.println(Arrays.toString(numeros));
                    System.out.println("Duplicado: " +numeros[i]);
                    numeros[i] = aleatorio.nextInt(10)+1;
                    estado = true;
                }
            }
        }


        System.out.println(Arrays.toString(numeros));

    }
}
