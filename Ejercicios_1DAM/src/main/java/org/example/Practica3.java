package org.example;

import java.beans.Expression;
import java.util.Scanner;

public class Practica3 {

    static void main(){
        Scanner teclado = new Scanner(System.in);

        int ALTURA = 0;
        final int ALTURAMINIMA = 140;
        final int ALTURAMAXIMA = 230;
        final int PESOMINIMO = ALTURA * 2/8;
        final int PESOMAXIMO = 120;
        int PESO = 0;

        System.out.println("***BIENVENIDO AL RATÓN JUEGTÓN***");
        try {
            System.out.println("¿Cuál es tu altura? (en cm)");

        ALTURA = teclado.nextInt();
        }catch (Exception e){
            System.out.println("Por favor pon un número");
        return;}
        final int CALCULOALTURA = ALTURAMINIMA-ALTURA;
        if (ALTURA>ALTURAMAXIMA || ALTURA<0){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR...");
        }else if (ALTURA<ALTURAMINIMA){
            System.out.println("LO SIENTO, NO PUEDES ENTRAR EN LA ATRACCIÓN. Te faltan "+CALCULOALTURA+  " cm de altura");
        return;
        }
        try{
            System.out.println("¿Cuál es tu peso?");
            PESO = teclado.nextInt();
        }catch (Exception e){
            System.out.println("Por favor pon un número");
        return;}
        final int CALCULOPESOMINIMO =PESOMINIMO-PESO;
        final int CALCULOPESOMAXIMO =PESO-PESOMAXIMO;
        if (PESO<PESOMINIMO){
            System.out.println("Pesas "+PESO+" kg. Peso mínimo calculado: "+PESOMINIMO+" kg. Te faltan "+CALCULOPESOMINIMO+" kg para subir a la atracción");
        }else if (PESO>PESOMAXIMO){
            System.out.println("Lo siento, sobrepasas " +CALCULOPESOMAXIMO+ " kg el límite de la atracción");
        }












    }
}
