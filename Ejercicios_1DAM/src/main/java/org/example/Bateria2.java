package org.example;

import java.util.Scanner;

public class Bateria2 {
    static void main(){
        Scanner teclado =new Scanner(System.in);
        final float jornada = 40;
        final double PlusExtra = 1.5F;

        System.out.println("¿Cuantas horas trabajas?");
        float numero1 = teclado.nextFloat();

        System.out.println("¿Cuál es tu tarifa por hora?");
        float numero2 = teclado.nextFloat();


        if (numero1>40){
            double HorasExtra = numero1 - jornada;
            double TarifaExtra = numero2* PlusExtra;
            double SalarioExtra = HorasExtra*TarifaExtra;

            double ResultadoHorasExtra= (float) (numero1*HorasExtra);

            System.out.println("Tu salario bruto con las horas extra es "+(SalarioExtra + jornada*numero2) + "€");
        }else {
            float resultado= numero1*numero2;

            System.out.println("Tu salario bruto es "+resultado);
        }

    }
}
