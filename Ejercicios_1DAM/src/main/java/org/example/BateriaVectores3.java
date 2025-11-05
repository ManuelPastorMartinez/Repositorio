package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BateriaVectores3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numero = 0;
        int vector[] = new int[25];
        int contador = 0;


        for (int i = 0; i<vector.length; i++){
            vector[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(vector));

        System.out.println("Dime un número para contar cuantas veces sale[0-100]");
        if (teclado.hasNextInt()){
            numero = teclado.nextInt();
        }else{
            System.out.println("Introduce un número válido");
            return;
        }

        if(numero<0 || numero>100){
            System.out.println("Introduce un número entre 100 y 0");
        }else {
            for (int i = 0; i< vector.length;i++){
                if(vector[i]==numero){
                    contador++;
                }
            }
        }
        System.out.println("El número " +numero+" aparece "+contador+" veces");
    }
}
