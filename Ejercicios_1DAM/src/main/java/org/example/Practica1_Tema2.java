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
        int numeros_dia = 0;
        int numeros_mes = 0;
        int numeros_anyo = 0;
        String fecha = String.valueOf(0);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa)");
        fecha = teclado.nextLine();
        int tamano = fecha.length();

        if (tamano == 10){
            String dia = fecha.substring(0,2);
            String mes =fecha.substring(3,5);
            String anyo = fecha.substring(6,10);

            try{
                numeros_dia = Integer.parseInt(dia);
                numeros_mes = Integer.parseInt(mes);
                numeros_anyo = Integer.parseInt(anyo);
            }catch (Exception e){
                System.out.println("Por favor introduce un formato válido");
                return;
            }


            if(numeros_dia>maximo_numeros_dia || numeros_dia<minimo_numeros_dia){
                System.out.println("Por favor introduce un día válido");
            }else if(numeros_mes>maximo_numeros_mes || numeros_mes<minimo_numeros_mes){
                System.out.println("Por favor introduce un mes válido");
            }else if(numeros_anyo>maximo_numeros_anyo || numeros_anyo<minimo_numeros_anyo){
                System.out.println("Por favor introduce un año válido");
            }else{
                int resultado = numeros_dia + numeros_mes + numeros_anyo;
                System.out.println(numeros_dia +"+"+numeros_mes +"+"+numeros_anyo+" = "+resultado);
                String particion_resultado =String.valueOf(resultado);

                String numero1 = particion_resultado.substring(0,1);
                String numero2 = particion_resultado.substring(1,2);
                String numero3 = particion_resultado.substring(2,3);
                String numero4 = particion_resultado.substring(3,4);

                int suma_numero1 = Integer.parseInt(numero1);
                int suma_numero2 = Integer.parseInt(numero2);
                int suma_numero3 = Integer.parseInt(numero3);
                int suma_numero4 = Integer.parseInt(numero4);

                int resultado_final = suma_numero1 + suma_numero2 + suma_numero3 + suma_numero4;
                System.out.println(resultado_final);
            }

        }else {
            System.out.println("Por favor, introduce un formato de fecha correcto");
        }


    }
}
