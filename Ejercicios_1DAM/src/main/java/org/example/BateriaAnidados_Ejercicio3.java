package org.example;

import java.util.Scanner;

public class BateriaAnidados_Ejercicio3 {
    static void main() {
        Scanner teclado =new Scanner(System.in);

        System.out.println("Introduce un número límite");
        int numero_limite = teclado.nextInt();

        bucle1:
        for (int i = 1;i<=9;i++){
            for (int n = 1;n<=10;n++){
                System.out.println(i +" x "+n+ " = "+(i*n));
                if (numero_limite<(i*n)){
                    break bucle1;
                }
            }
        }
    }
}
