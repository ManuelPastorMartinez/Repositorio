package Tema4;

import java.util.Scanner;

public class BateriaTema4_ejercicio1 {

    public static void main(String[] args){
    }

    public static int funcion(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();
        return numero*numero*numero;
    }

    public static boolean par(int numero){
        if (numero%2==0){
            return true;
        }else{
            return false;
        }
    }
}
