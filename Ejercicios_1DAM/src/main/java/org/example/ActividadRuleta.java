package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ActividadRuleta {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        final String COLORES[] ={"rojo","negro"};

        Integer numeros[] = new Integer[37];
        for (int i = 0; i< numeros.length; i++ ){
            numeros[i] = i;
        }

        final String PAR_IMPAR[] ={"par","impar"};

        System.out.println("Introduce un número entre el 0 y el 36");
        int numero = teclado.nextInt();

        if (!Arrays.asList(numeros).contains(numero)){
            System.out.println("ERROR. El numero no es válido");
            return;
        }

        String color = "";
        String eleccion = "";
        if (numero != 0){
            System.out.println("Introduce un color (rojo o negro)");
            color = teclado.next().toLowerCase();
            if (!Arrays.asList(COLORES).contains(color)){
                System.out.println("NO ESTÁ");
                return;
            }
            System.out.println("Introduce si quieres par o impar ");
            eleccion = teclado.next().toLowerCase();
            if (!Arrays.asList(PAR_IMPAR).contains(eleccion)){
                System.out.println("ERROR. La apuesta no es válida (par-impar)");
                return;
            }


        }
        String color_sorteo = COLORES[aleatorio.nextInt(2)];
        int numero_sorteo = numeros[aleatorio.nextInt(37)];

        String par_impar_sorteo = numero_sorteo % 2 == 0 ? "par":"impar";
        System.out.println("Ha salido "+numero_sorteo +" "+color_sorteo+" "+par_impar_sorteo);

        if (numero_sorteo == numero && color_sorteo.equals(color) && par_impar_sorteo.equals(eleccion)){
            System.out.println("HAS GANADO!!");
        } else if (numero_sorteo == numero) {
            System.out.println("Has acertado el número");
            if (numero_sorteo == 0 && numero_sorteo == numero){
                System.out.println("EL NUMERO ES 0, HAS GANADO!! (todos los demás usuarios de la mesa pierden)");
            }
        }else if (color_sorteo.equals(color)){
            System.out.println("Has acertado el color "+color);
        }else if(eleccion.equals(par_impar_sorteo)){
            System.out.println("Has acertado "+par_impar_sorteo);
        }else{
            System.out.println("Has perdido");
        }

    }
}
