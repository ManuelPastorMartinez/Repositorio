package org.example;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Practica2_Tema2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        double operando = 0;
        double operando2 = 0;
        double resultado = 0;
        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA****");

        System.out.println("> Introduce un operando: ");
        if (teclado.hasNextDouble()){
            operando = teclado.nextInt();
        }else {
            System.out.println("Por favor introduce un número correcto");
            seguir = false;
        }

        if (seguir){
        System.out.println("----------------------------------------------");
        System.out.println("[+] -> sumar");
        System.out.println("[-] -> restar");
        System.out.println("[x] -> multiplicar");
        System.out.println("[/] -> dividir");
        System.out.println("[R] -> Raíz Cuadrada");
        System.out.println("----------------------------------------------");

        System.out.println("Introduce la operación que quieres hacer");
        teclado.nextLine();
        String operacion = teclado.next();
        if(operacion.equals("R")){

        }else {
            System.out.println("Introduce el segundo operando");
            if (teclado.hasNextDouble()){
                operando2 = teclado.nextDouble();
            }else{
                System.out.println("Por favor introduce un operando válido");
            }
        }
        switch (operacion.toLowerCase()) {
            case "+":
                    resultado = operando + operando2;

                    System.out.println("El resultado de la suma de " + operando + " y de " + operando2 + " es " + resultado);

                break;
            case "-":

                    operando2 = teclado.nextDouble();

                    resultado = operando + operando2;
                    System.out.println("El resultado de la resta de " + operando + " y de " + operando2 + " es " + resultado);
                break;
            case "x":

                    operando2 = teclado.nextDouble();

                    resultado = operando * operando2;
                    System.out.println("El resultado de la multiplicación de " + operando + " y de " + operando2 + " es " + resultado);
                break;
            case "/":
                if (operando2 == 0){
                    System.out.println("No se puede dividir entre 0");
                }else {
                    resultado = operando/operando2;
                    System.out.println("El resultado de la división de " + operando + " y de " + operando2 + " es " + resultado);
                }
                break;
            case "R":
                if(operando2<0){
                    System.out.println("Por favor pon un número real");
                }else {
                    resultado = Math.sqrt(operando);
                    System.out.println("El resultado de la raíz cuadrada de "+operando+" es "+resultado);
                }
            default:
                System.out.println("Por favor introduce una operación válida");
                break;
        }

        }

    }
}
