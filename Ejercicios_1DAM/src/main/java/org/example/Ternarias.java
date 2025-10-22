package org.example;

public class Ternarias {
    static void main() {

        int a = 5, b = 6, c = 7;
        int resultado = a++ == 6 && b++ == c ? a += b :
                                         a == 5 ? a++ :
                                        a == 6 ? a+=c : a;

        System.out.println(resultado);
    }
}
