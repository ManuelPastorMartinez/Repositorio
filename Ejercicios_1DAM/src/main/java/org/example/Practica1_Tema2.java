package org.example;

import java.util.Scanner;

public class Practica1_Tema2 {
    static void main(){
        Scanner teclado = new Scanner(System.in);
        final int MAXIMO_NUMEROS_DIA = 31;
        final int MAXIMO_NUMEROS_MES = 12;
        final int MAXIMO_NUMEROS_ANYO = 2025;
        final int MINIMO_NUMEROS_DIA = 01;
        final int MINIMO_NUMEROS_MES = 01;
        final int MINIMO_NUMEROS_ANYO = 1930 ;
        //primero defino todas las constantes
        int numeros_dia = 0;
        int numeros_mes = 0;
        int numeros_anyo = 0;
        String formato1 = "/";
        String formato2 = "-";
        String formato3 = " ";
        String fecha = String.valueOf(0);
        //también inicializo todas las variables a las que cambiaré el valor más adelante

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa)");
        fecha = teclado.nextLine();
        //primero pregunto la fecha de nacimiento

        String separador1 = fecha.substring(2,3);
        String separador2 = fecha.substring(5,6);



            int tamano = fecha.length();
            if (tamano == 10){
                //este if es para que el formato de la fecha sea el correcto y no se puedan poner más ni menos números

                String dia = fecha.substring(0,2);
                String mes =fecha.substring(3,5);
                String anyo = fecha.substring(6,10);
                //estos strings es para
                try{
                    numeros_dia = Integer.parseInt(dia);
                    numeros_mes = Integer.parseInt(mes);
                    numeros_anyo = Integer.parseInt(anyo);
                }catch (Exception e){
                    System.out.println("Por favor introduce un formato válido");
                    return;
                }

                if (separador1.equals(formato1)|| separador1.equals(formato2) || separador1.equals(formato3) || separador2.equals(formato1)|| separador2.equals(formato2) || separador2.equals(formato3)) {
                    //este condicional sirve para que en el formato de la fecha solo se pueda diferenciar el mes el dia y el año con barra , guión o espacio
                    if (numeros_dia > MAXIMO_NUMEROS_DIA || numeros_dia < MINIMO_NUMEROS_DIA) {
                        System.out.println("Por favor introduce un día válido");
                    } else if (numeros_mes > MAXIMO_NUMEROS_MES || numeros_mes < MINIMO_NUMEROS_MES) {
                        System.out.println("Por favor introduce un mes válido");
                    } else if (numeros_anyo > MAXIMO_NUMEROS_ANYO || numeros_anyo < MINIMO_NUMEROS_ANYO) {
                        System.out.println("Por favor introduce un año válido");
                    } else {
                        int resultado = numeros_dia + numeros_mes + numeros_anyo;
                        System.out.println(numeros_dia + "+" + numeros_mes + "+" + numeros_anyo + " = " + resultado);
                        String particion_resultado = String.valueOf(resultado);

                        String numero1 = particion_resultado.substring(0, 1);
                        String numero2 = particion_resultado.substring(1, 2);
                        String numero3 = particion_resultado.substring(2, 3);
                        String numero4 = particion_resultado.substring(3, 4);


                        int suma_numero1 = Integer.parseInt(numero1);
                        int suma_numero2 = Integer.parseInt(numero2);
                        int suma_numero3 = Integer.parseInt(numero3);
                        int suma_numero4 = Integer.parseInt(numero4);

                        int resultado_final = suma_numero1 + suma_numero2 + suma_numero3 + suma_numero4;
                        System.out.println(suma_numero1 + "+" + suma_numero2 + "+" + suma_numero3 + "+" + suma_numero4 + " = " + resultado_final);
                        System.out.println("Tu número de la suerte es " + resultado_final);
                    }
                }else {
                        System.out.println("Por favor, pon los separadores de la fecha correctamente (/, - o espacio)");
                    }

            }else {
                System.out.println("Por favor, introduce un formato de fecha correcto");
            }




    }
}
