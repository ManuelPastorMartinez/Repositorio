package org.example;

import java.util.Scanner;

public class Bateria1 {
    static void main(){
        Scanner teclado =new Scanner(System.in);

        System.out.println("¿cuantas horas trabajas");
        float numero1 = teclado.nextFloat();

        System.out.println("¿Cual es tu tarifa por hora?");
        float numero2 = teclado.nextFloat();

        float resultado= numero1*numero2;

        System.out.println("Tu salario bruto es " +resultado);
    }


}
