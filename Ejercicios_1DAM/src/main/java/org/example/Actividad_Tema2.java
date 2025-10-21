package org.example;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad_Tema2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        boolean seguir = true;
        final int ANYO_MINIMO = 1900;
        int modo = 0;
        int anyo_nacimiento_int = 0;
        int edad = 0;

        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();


        System.out.println("Elige un modo (1 o 2)");
        System.out.println("[1] - Año de nacimiento");
        System.out.println("[2] - Edad");
        System.out.println("---------------------------------------");

        if (teclado.hasNextInt()){
             modo = teclado.nextInt();
        }else {
            System.out.println("Valor del modo incorrecto");
            seguir = false;
        }

        if (seguir){

            if (modo == 1){
                System.out.println("Introduce tu año de nacimiento");
                String anyo_nacimiento = teclado.next();
            try {
                anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
            }catch (NumberFormatException e){
                System.out.println("Por favor pon números");
                return;
            }




            } else if (modo == 2) {
                System.out.println("Por favor introduce tu edad: ");
                if (teclado.hasNextInt()){
                     edad = teclado.nextInt();
                }else {
                    System.out.println("Por favor introduce un formao de edad correcto (numérico)");
                    return;
                }

                if (edad>=0 && edad <= 125){
                    anyo_nacimiento_int = anyo_actual-edad;


                }else {
                    System.out.println("Por favor introduce una edad válida");
                    return;
                }


            }else {
                System.out.println("Por favor introduce un modo correcto (1 o 2)");
                return;
            }

            if (anyo_nacimiento_int>=ANYO_MINIMO && anyo_nacimiento_int<=anyo_actual){

                if (anyo_nacimiento_int<=1927){
                    System.out.println("Generación sin bautizar");
                }else if(anyo_nacimiento_int>=1928 && anyo_nacimiento_int<=1944){
                    System.out.println("Generación silent");
                }else if(anyo_nacimiento_int>=1945 && anyo_nacimiento_int<=1964){
                    System.out.println("Baby Boomers");
                }else if(anyo_nacimiento_int>=1965 && anyo_nacimiento_int<=1981){
                    System.out.println("Generación X");
                }else if(anyo_nacimiento_int>=1982 && anyo_nacimiento_int<=1994){
                    System.out.println("Generación Y o Millenial");
                }else{
                    System.out.println("Generación Z");
                }
            }else {
                System.out.println("Introduce un año válido");
            }
        }

    }
}
