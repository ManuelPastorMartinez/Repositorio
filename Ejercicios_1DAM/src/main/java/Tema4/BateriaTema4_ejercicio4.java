package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class BateriaTema4_ejercicio4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double recaudacion[] = recaudacion();
        System.out.println(Arrays.toString(recaudacion));

        System.out.println(diaMaximo(recaudacion));

        double media = media(recaudacion);
        System.out.println(media);

        double domingo = domingo(recaudacion);
        System.out.println(domingo);

        if (domingo>media){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
    public static double[] recaudacion(){
        Scanner teclado = new Scanner(System.in);
        double dias[] = new double[6];
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Dia "+(i+1)+":");
            dias[i] = teclado.nextDouble();
        }
        return dias;
    }

    public static String  diaMaximo(double dias[]){
        double maximo = dias[0];
        int dia = 0;
        for (int i = 0; i < dias.length-1; i++) {
            if (dias[i] > maximo){
                maximo = dias[i];
                dia = i;
            }
        }

        return dia_semana(dia);

    }

    public static String dia_semana(int dia){

        switch (dia){
            case 0:
                return "MARTES";
            case 1:
                return "MIÉRCOLES";
            case 2:
                return "JUEVES";
            case 3:
                return "VIERNES";
            case 4:
                return "SÁBADO";
            case 5:
                return "DOMINGO";
        }

        return "";
    }

    public static double media (double recauadcion[]){

        double acumulado = 0;

        for (int i = 0; i < recauadcion.length; i++) {
            acumulado+= recauadcion[i];
        }

        return (acumulado/recauadcion.length);
    }

    public  static double domingo (double recaudacion[]){

        return recaudacion[recaudacion.length-1];
    }
}
