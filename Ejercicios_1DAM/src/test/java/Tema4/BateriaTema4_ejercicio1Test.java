package Tema4;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BateriaTema4_ejercicio1Test {

    @Test
    void funcion() {

     //   assertAll(
     //           () -> assertEquals( 8,BateriaTema4_ejercicio1.funcion(2)),
     //           () -> assertEquals(27,BateriaTema4_ejercicio1.funcion(3))
     //   );

        String entradaSimulada = "2";
        System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));

        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        assertEquals(8,BateriaTema4_ejercicio1.funcion());

        String salidaEsperada ="Introduce un número";
        assertTrue(salida.toString().contains(salidaEsperada));


    }

    @Test

    void par() {
        assertAll(
                ()->assertFalse(BateriaTema4_ejercicio1.par(3)),
                ()->assertTrue(BateriaTema4_ejercicio1.par(4))
        );

    }
}