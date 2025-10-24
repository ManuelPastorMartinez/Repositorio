package org.example;

import java.util.Scanner;

public class Practica3_Tema2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        System.out.println("****BIENVENIDO AL COMPROBADOR AL ISBN****");
        System.out.println("---------------------------------");
        System.out.println("¿Que quieres hacer?");
        System.out.println("[1]-Validar el ISBN");
        System.out.println("[2]-Reparar el ISBN");
        System.out.println("[X]-Salir");
        System.out.println("---------------------------------");

        teclado.nextLine();
        String opcion = teclado.next().toLowerCase();

        switch (opcion){
            case "1":

                System.out.println("Has escogido validar el ISBN");
                System.out.println("Primero por favor introduce tu ISBN");
                String ISBN = teclado.next();


                int tamanyo_ISBN = ISBN.length();
                if (tamanyo_ISBN == 10){
                    for (int i = 10; i>= 1 ; i++){
                        int parte1 = 0;
                        int parte2 = 0;
                        String trozo_10 = ISBN.
                    }
                }else {
                    System.out.println("Tamaño incorrecto, por favor introduce un ISBN válido");
                }

                break;
            case "2":
                break;
            case "x":
                break;
            default:
                System.out.println("Introduce una opción válida que quieras hacer");
                break;
        }


    }
}
