package Tema4;

import java.util.Scanner;

public class Modo2 {
    // Asume fichero llamado solution.java

        static Scanner teclado;

    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

        public static boolean casoDePrueba() {
            //leer caso de prueba

            int x = teclado.nextInt();
            int y = teclado.nextInt();
            teclado.nextLine();
             if (x<0 || y<0){
                 return false;
             }else {
                 System.out.println((x+y)*2);
                 return true;
             }
        }
}
