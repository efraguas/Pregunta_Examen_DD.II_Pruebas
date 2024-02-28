package Pruebas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorTest {

    private Generador generador;

    @BeforeEach
    void setUp() {
        generador = new Generador();
    }


    @Test
    void generadorletraDNI() {
        //probando que el metodo genera la salida correctamente
        assertEquals("L",generador.generadorletraDNI(51101373));
    }
}