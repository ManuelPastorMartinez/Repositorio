package org.example;

import java.util.Scanner;

public class Bateria1 {
    static void main(){
        Scanner teclado =new Scanner(System.in);
        float numero1 = 0;
        float numero2 = 0;

        boolean control = true;
        do {
            try {
                System.out.println("¿cuantas horas trabajas?");
                numero1 = teclado.nextFloat();

                System.out.println("¿Cual es tu tarifa por hora?");
                numero2 = teclado.nextFloat();

                control = false;

            } catch (Exception e){
                System.out.println("Introduce un número por favor");
                control = true;
            }
            teclado.nextLine();
        }while (control == true);

        float resultado= numero1*numero2;
        System.out.println("Tu salario bruto es " +resultado);




    }


}
