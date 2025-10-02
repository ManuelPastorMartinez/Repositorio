package org.example;

import java.beans.Expression;
import java.util.Scanner;

public class Practica3 {

    static void main(){
        Scanner teclado = new Scanner(System.in);
        int ALTURA = 0;
        final int ALTURAMINIMA = 140;
        final int ALTURAMAXIMA = 230;
        final int PESOMAXIMO = 120;
        int PESO = 0;
        //Primero calculo todos los datos necesarios para la altura y defino las constantes ya que no van a cambiar, además defino el peso y la altura
        //en 0 para guardarlos y después pedirlos otra vez, por lo tanto son variables y no llevan el final.


        System.out.println("***BIENVENIDO AL RATÓN JUEGTÓN***");
        try {
            System.out.println("¿Cuál es tu altura? (en cm)");

        ALTURA = teclado.nextInt();
        //Defino la altura dándole otro valor que no es 0 como al principio
        }catch (Exception e){
            System.out.println("Por favor pon un número");
        return;}
        //El try-catch sirve para poder controlar que te pongan solo números y darte un mensaje si pones letras.
        //El return sirve para que pare el programa y no siga adelante aun con el fallo.
        final int CALCULOALTURA = ALTURAMINIMA-ALTURA;
        if (ALTURA>ALTURAMAXIMA || ALTURA<0){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR...");
        return;
        // Esta parte es para que no te puedan poner ningùn nùmero negativo ni ninguna altura mayor a 230
        // El return otra vez para parar el programa y que no siga al equivocarte.
        }else if (ALTURA<ALTURAMINIMA){
            System.out.println("LO SIENTO, NO PUEDES ENTRAR EN LA ATRACCIÓN. Te faltan "+CALCULOALTURA+  " cm de altura");
        return;
        //Esta parte calcula si la altura es menor que la altura mínima y si eres más pequeño te dice que no puedes pasar y te pone lo que te falta
        //con el cálculo que hago arriba de CALCULOALTURA.
        // El return otra vez para finalizar el programa y evitar que siga.
        }
        try{
            System.out.println("¿Cuál es tu peso?");
            PESO = teclado.nextInt();
        }catch (Exception e){
            System.out.println("Por favor pon un número");
        return;}
        //Ahora pasamos a la parte del peso, donde te lo pide otra vez para guardar la variable y que no sea 0 (con el try-catch y el return para evitar letras)
        final int PESOMINIMO = (ALTURA * 2/8);
        final int CALCULOPESOMINIMO =PESOMINIMO-PESO;
        final int CALCULOPESOMAXIMO =PESO-PESOMAXIMO;
        //Aqui defino todas las variables y calculo todas las constantes que hacen falta para el peso.
        if (PESO<PESOMINIMO){
            System.out.println("Pesas "+PESO+" kg. Peso mínimo calculado: "+PESOMINIMO+" kg. Te faltan "+CALCULOPESOMINIMO+" kg para subir a la atracción");
        }else if (PESO>PESOMAXIMO){
            System.out.println("Lo siento, sobrepasas " +CALCULOPESOMAXIMO+ " kg el límite de la atracción");
        //Aquí pongo dos ifs para decir que si pesas menos que el mínimo o si te pasas del máximo no puedes subir y
        //te pone lo que te falta para conseguir el peso

        }else{
            System.out.println("Pesas "+PESO+ " kg. Peso mínimo calculado: "+PESOMINIMO+ " kg. Puedes subir a la atracción");
        }
        //por último, pongo el else que funciona como "sí no pasa nada raro puedes subir".












    }
}
