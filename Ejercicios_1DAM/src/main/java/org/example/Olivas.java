package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Olivas {
    static void main() {
        Scanner teclado =new Scanner(System.in);

        System.out.println("**** BIENVENIDO AL OLIVÓMETRO ****");

        System.out.println("Introduce el tamaño de tu bancal...");

        System.out.println("Ancho: ");
        int anchura = teclado.nextInt();

        System.out.println("Alto: ");
        int altura = teclado.nextInt();

        String  matriz[][] = new String[altura][anchura];

        System.out.println("Introduce (por hileras) los kg por árbol de tu bancal: ");

        double suma_kilos = 0;
        double suma_litros = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = teclado.next();
                int matriz_int = Integer.parseInt(matriz[i][j]);
                if (matriz_int<1 || matriz_int>50){
                    System.out.println("Introduce un número válido ");
                    i--;
                }else{
                    suma_kilos += matriz_int;
                }

            }
        }

        suma_litros = suma_kilos/8;

        System.out.println("==================================");
        System.out.println("MAPA de tu bancal actual: ");
        for (String fila[] : matriz ){
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("================================");
        System.out.println("Total kg generados: "+suma_kilos+" kg");
        System.out.println("Litros totales obtenidos: "+suma_litros+" L");
        System.out.println("Litros por hilera...");
        double suma_hileras = 0;
        double litros_hilera = 0;
        for (int i = 0; i< matriz.length;i++){

            for (int j = 0; j < matriz[i].length; j++) {
                suma_hileras+= Integer.parseInt(matriz[i][j]);
            }
            litros_hilera = suma_hileras/8;
            System.out.println("Hilera "+(i+1)+": "+litros_hilera+ " L");
            suma_hileras = 0;
        }

        System.out.println("Olivos más productivos (>35kg):");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma_hileras+= Integer.parseInt(matriz[i][j]);
                if (suma_hileras>35){
                    System.out.println("En la posición ("+i+","+j+") con "+suma_hileras+"kg");
                }
            }

            System.out.println(suma_hileras);
            suma_hileras=0;
        }


    }
}
