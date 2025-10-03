package org.example;

import java.util.Scanner;

public class practica4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int numero1= 0;
        int numero2 =0;
        boolean control = true;

        do {
            try {
                do {
                    System.out.println("Dame un número de 3 cifras");
                    numero1 = teclado.nextInt();
                    control= false;
                }while(numero1<100 || numero1>999);
            } catch (Exception e) {
                System.out.println("Por favor pon un número");
            }

                teclado.nextLine();
            }while (control == true);

        control=true;
        do {
            try {
                do {
                    System.out.println("Dame otro número de 3 cifras");
                    numero2 = teclado.nextInt();
                    control= false;
                }while (numero2<100 || numero2>999);
            } catch (Exception e){
                System.out.println("Por favor pon un número");
            }
            teclado.nextLine();
        }while (control == true);









    }

}





