package org.example;

import java.util.Random;

public class Aleatorios {
    static void main() {

       Random aleatorio = new Random();

      int numero = aleatorio.nextInt(1,10);
      System.out.println(numero);

      double numero3 = aleatorio.nextDouble();
      System.out.println(numero3);

      int numero2 = (int) (Math.random()*10 + 1);
      System.out.println(numero2);
    }
}
