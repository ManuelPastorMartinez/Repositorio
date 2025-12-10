package Tema4;

import java.util.Arrays;

public class PartidoDeSquash {

    static java.util.Scanner teclado;

    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {


        //leer caso de prueba
        String puntuacion = teclado.nextLine().toUpperCase();
        String cadena_puntuacion[] = puntuacion.split("");
        int puntuacion_equipoA = 0;
        int puntuacion_equipoB = 0;

        if (puntuacion.matches("F")) {
            return false;
        }else {
            // CÓDIGO PRINCIPAL AQUÍ
            for (int i = 0; i < cadena_puntuacion.length; i++) {
                if (puntuacion_equipoA==9 || puntuacion_equipoB==9){
                    break;
                }
                if (Arrays.asList(cadena_puntuacion[i]).contains("A")){
                    puntuacion_equipoA++;
                } else if (Arrays.asList(cadena_puntuacion[i]).contains("B")) {
                    puntuacion_equipoB++;
                }else if (Arrays.asList(cadena_puntuacion[i]).contains("F")){
                    break;
                }
            }
            System.out.println(puntuacion_equipoA+"-"+puntuacion_equipoB);
            return true;
        }
    } // casoDePrueba

}
