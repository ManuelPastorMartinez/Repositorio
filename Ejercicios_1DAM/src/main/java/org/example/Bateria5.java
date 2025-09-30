package org.example;

import java.util.Scanner;

public class Bateria5 {

    static void main(){

        Scanner teclado = new Scanner(System.in);
        int numerador = 0;
        int denominador = 0;

        boolean control = true;

        do {
            try{
                System.out.println("Introduce un numerador");
                 numerador = teclado.nextInt();

                System.out.println("Introduce un denominador");
                denominador = teclado.nextInt();
                control = false;
            }catch (Exception e){
                System.out.println("Por favor introduce un número entero");
                control = true;
            }
            teclado.nextLine();
        }while (control==true);



            int resultado = numerador / denominador;
            System.out.println("El resultado es "+resultado);


    }
}
