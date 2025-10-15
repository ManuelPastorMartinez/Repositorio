package org.example;

import java.util.Scanner;

public class Practica1_Tema2 {
    static void main(){
        Scanner teclado = new Scanner(System.in);
        final int maximo_numeros_dia = 31;
        final int maximo_numeros_mes = 12;
        final int maximo_numeros_anyo = 2025;
        final int minimo_numeros_dia = 01;
        final int minimo_numeros_mes = 01;
        final int minimo_numeros_anyo = 1930 ;

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa)");
        String fecha = teclado.nextLine();

        String dia = fecha.substring(0,2);
        String mes =fecha.substring(3,5);
        String anyo = fecha.substring(6,10);


        int numeros_dia = Integer.parseInt(dia);
        int numeros_mes = Integer.parseInt(mes);
        int numeros_anyo = Integer.parseInt(anyo);

        if(numeros_dia>maximo_numeros_dia || numeros_dia<minimo_numeros_dia){
            System.out.println("Por favor introduce un día válido");
        }else if(numeros_mes>maximo_numeros_mes || numeros_mes<minimo_numeros_mes){
            System.out.println("Por favor introduce un mes válido");
        }else if(numeros_anyo>maximo_numeros_anyo || numeros_anyo<minimo_numeros_anyo){
            System.out.println("Por favor introduce un año válido");
        }else{

        }


    }
}
