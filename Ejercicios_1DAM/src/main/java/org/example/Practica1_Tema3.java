package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica1_Tema3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String equipo ="";
        int suma = 0;
        final int PODER = 30;
        int equipo_actual = 1;
        boolean estado = true;
        int equipo1[]= new int[7];
        int equipo2[]= new int[7];
        int ronda = 0;

        do{
            suma = 0;
            System.out.println("Equipo "+ equipo_actual);
            System.out.print("Introduce la potencia de los samurais: ");
            equipo= teclado.nextLine();
            String cadena_equipo[] = equipo.split(" ");

            int vector[] = new int[cadena_equipo.length];
            for (int i=0;i<cadena_equipo.length;i++){
                vector[i] = Integer.parseInt(cadena_equipo[i]);
                suma += vector[i];
            }
            if (vector.length != 7){
                System.out.println("ERROR. Introduce 7 samurais");
            }else {
                if (suma != PODER ) {
                    System.out.println("ERROR. La potencia total no suma 30");

                }else {
                    if (equipo_actual == 1){
                        equipo1 = vector.clone();
                        equipo_actual++;
                    }else{
                        equipo2 = vector.clone();
                        break;
                    }
                    System.out.println("Equipo completado");
                }
            }
        }while (true);

        System.out.println("Empieza la batalla!");

        for (int samurai_equipos = random.nextInt(7)+1;samurai_equipos<equipo.length();samurai_equipos++){
            System.out.println("La batalla inicia con el samurai "+samurai_equipos);
            System.out.println();
        }



    }
}
