package org.example;

import java.util.Scanner;

public class Bateria2 {
    static void main(){
        Scanner teclado =new Scanner(System.in);
        final float jornada = 40;
        final double PlusExtra = 1.5F;

        float numero1 = 0;
        float numero2 = 0;
        boolean control = true;

        do {
            try {
                System.out.println("¿Cuantas horas trabajas?");
                numero1 = teclado.nextFloat();

                System.out.println("¿Cuál es tu tarifa por hora?");
                numero2 = teclado.nextFloat();

                control = false;
            }catch (Exception e){
                System.out.println(" por favor introduce un número valido");
            }
            teclado.nextLine();
        }while (control == true);

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
