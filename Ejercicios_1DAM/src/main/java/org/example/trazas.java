package org.example;

import java.util.Scanner;

public class trazas {
    static void main() {
        int a, b, c, d;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un valor para a");
        a = teclado.nextInt();
        b = 0;
        c = 1;

        while(a!=0){
            b++;
            c = c * a / b;
            a = teclado.nextInt();
        }

        d = b + c;

        System.out.println(d);
    }
}
