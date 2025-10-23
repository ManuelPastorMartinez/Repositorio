package org.example;

import java.util.Scanner;

public class ejercicio3_bateria2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        for (int i=1;i<=50;i++){

            if (i % 3 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
