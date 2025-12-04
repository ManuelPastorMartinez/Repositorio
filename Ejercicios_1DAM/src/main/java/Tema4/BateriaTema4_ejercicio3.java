package Tema4;

import java.util.Scanner;

public class BateriaTema4_ejercicio3 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra o frase");
        String frase = teclado.nextLine();
        frase = mayusculas(frase);
        System.out.println(frase);

        System.out.println("Cantidad de vocales que hay en la frase");
        int vocales = vocales(frase);
        System.out.println(vocales);



    }
    public static String mayusculas(String frase_mayusculas ){

        frase_mayusculas = frase_mayusculas.toUpperCase();
        return frase_mayusculas;
    }

    public static int vocales(String contar_vocales){
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j = 0; j < contar_vocales.length(); j++) {
            switch (contar_vocales.charAt(j)){
                case 'A':
                    a++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'I':
                    i++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'U':
                    u++;
                    break;


            }
        }
        System.out.println("A: "+a);
        System.out.println("E: "+e);
        System.out.println("I: "+i);
        System.out.println("O: "+o);
        System.out.println("U: "+u);
        return a+e+i+o+u;
    }
}
