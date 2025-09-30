package org.example;

import java.util.Scanner;

public class Bateria3 {
    static void main(){
        Scanner teclado = new Scanner(System.in);

            System.out.println("Dime un número");
            float numero1 = teclado.nextFloat();
            if (numero1>0){
                System.out.println(numero1 +" es mayor que 0");
            } else if (numero1<0) {
                System.out.println(numero1 +" es menor que 0");
            } else {
                System.out.println(numero1 +" es 0");
            }




    }

}
