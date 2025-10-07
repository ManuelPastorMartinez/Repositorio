package org.example;

import java.util.Scanner;

public class practica4 {

    //Este programa te pide dos números de 3 cifras y los multiplica, dandote el proceso de la multiplicación
     static void main() {
        Scanner teclado = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int cifra1 = 0;
        int cifra2 = 0;
        int cifra3 = 0;
         int resultado = 0;
        boolean control = true;// el boolean es para poder hacer el bucle del try-catch.
        // Guardo las variables arriba con valor 0 para después cambiarle el valor.

        //Primero hago un bucle de try-catch para controlar si pones alguna letra que te diga que no puedes y te vuelva a pedir el número
        do {
            try {
                control = true;
                    System.out.print("Introduce un numero de 3 cifras: ");
                    numero1 = Integer.parseInt(teclado.nextLine());

                if ((numero1 < 100 || numero1 > 999) && (numero1 > -100 || numero1 < -999)){//Este if es para controlar que se puedan números positivos y negativos
                    System.out.println("Pon un número de 3 cifras");                        //y controlar que no se puedan poner números que tengan mas o menos de
                    control = false;                                                        //3 cifras
                }

            } catch (Exception e) {
                System.out.println("Entrada no válida. Introduce solo números enteros."); //Este es el mensaje que muestra si pones letras cuando te pide el número
                control = false;
            }
        } while (control==false);


        do {
            control = true;
            try {
                System.out.print("Introduce otro número de 3 cifras: ");
                numero2 = Integer.parseInt(teclado.nextLine());

                if ((numero2 < 100 || numero2 > 999)  && (numero2 > -100 || numero2 < -999)) {//Este if hace lo mismo que el anterior if pero con número2
                    System.out.println("Pon un número de 3 cifras");
                    control = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduce solo números enteros.");
                control = false;
            }
        } while (control==false);
         if (numero2 < 0){ //Este if sirve para controlar que si pones un número negativo el string te coja el número y no el signo negativo, dandote error
             String multStr = Integer.toString(numero2); //El string sirve para guardar carácteres específicos de las líneas de la variable.
             cifra3 = Integer.parseInt(multStr.substring(1, 2)); //Este string guarda el primer número de numero2 (negativo)
             cifra2 = Integer.parseInt(multStr.substring(2, 3)); //Este string guarda el segundo número de numero2 (negativo)
             cifra1 = Integer.parseInt(multStr.substring(3, 4)); //Este string guarda el tercer número de numero2 (negativo)
         }else {//Este else es para cuando se ponga un número positivo.
             String multStr = Integer.toString(numero2);
             cifra3 = Integer.parseInt(multStr.substring(0, 1)); //Este string guarda el primer número de numero2 (positivo)
             cifra2 = Integer.parseInt(multStr.substring(1, 2)); //Este string guarda el segundo número de numero2 (positivo)
             cifra1 = Integer.parseInt(multStr.substring(2, 3)); //Este string guarda el tercer número de numero2 (positivo)

         }


         int total1 = numero1 * cifra1; //Resultado de la primera línea
         int total2 = numero1 * cifra2; //Resultado de la segunda línea
         int total3 = numero1 * cifra3; //Resultado de la tercera línea
         resultado = numero1 * numero2; //Resultado final de la multiplicación

        System.out.println();
        System.out.println("El resultado de la multiplicación es: " + resultado);
        System.out.println("El proceso es:");
        System.out.println("   " + numero1);
        System.out.println(" x " + numero2);
        System.out.println(" -------");
        System.out.println("   " + total1);
        System.out.println("  " + total2 + "x");
        System.out.println(" " + total3 + "xx");
        System.out.println(" --------");
        System.out.println(" "+resultado);
//Por último muestro el proceso de la multiplicación entero (la X significa un espacio en blanco)
        
    }
}





