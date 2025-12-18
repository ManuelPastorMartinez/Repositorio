package Tema4;

public class PartidoDeSquash {

    static java.util.Scanner teclado;

    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

    public static boolean casoDePrueba() {

        //leer caso de prueba
        char saque = 'A';
        boolean espacio = false;
        boolean imprimir = true;
        String puntuacion = teclado.next().toUpperCase();

        if (puntuacion.equals("F")) {
            return false;
        }

        int puntuacion_equipoA = 0;
        int puntuacion_equipoB = 0;

            // CÓDIGO PRINCIPAL AQUÍ
            for (int i = 0; i < puntuacion.length(); i++) {
                char letra =puntuacion.charAt(i);

                if (letra =='F'&& imprimir) {
                    if (espacio){
                        System.out.print(" ");
                    }
                    System.out.print(puntuacion_equipoA+"-"+puntuacion_equipoB);
                    break;
                }else {
                    imprimir = true;
                }

                if (letra=='A') {
                    if (saque=='A') {
                        puntuacion_equipoA++;
                    }
                    saque = 'A';
                } else if (letra=='B'){
                    if (saque =='B' ) {
                        puntuacion_equipoB++;
                    }
                    saque = 'B';
                }

                if (puntuacion_equipoA>=9 && puntuacion_equipoA-puntuacion_equipoB>1 || puntuacion_equipoB>=9 && puntuacion_equipoB-puntuacion_equipoA>1 ){
                    if (espacio){
                        System.out.print(" ");
                    }
                    System.out.print(puntuacion_equipoA+"-"+puntuacion_equipoB);
                    puntuacion_equipoA=0;
                    puntuacion_equipoB=0;
                    espacio=true;
                    imprimir=false;
                }
            }
            System.out.println();
            return true;

    } // casoDePrueba

}
