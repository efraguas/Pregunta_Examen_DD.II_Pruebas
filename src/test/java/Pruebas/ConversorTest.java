package Pruebas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversorTest {

    private Conversor test_Celsius_Fahrenheit;
    private Conversor test_celsius;
    private Conversor test_kelvin;
    private Conversor test_toKelvin;
    private Conversor test_esCapicua;
    private Conversor test_esPalindromo;

    @BeforeEach
    void setUp() {
        Conversor test_Celsius_Fahrenheit = new Conversor();
        Conversor test_celsius = new Conversor();
        Conversor test_kelvin = new Conversor();
        Conversor test_toKelvin = new Conversor();
        Conversor test_esCapicua = new Conversor();
        Conversor test_esPalindromo = new Conversor();
    }


    @Test
    void celsius_fahrenheit() {

        assertEquals(212, test_Celsius_Fahrenheit.celsius_fahrenheit(100));
        assertEquals(122, test_Celsius_Fahrenheit.celsius_fahrenheit(50));
        assertEquals(89.6, test_Celsius_Fahrenheit.celsius_fahrenheit(32));
        assertEquals(32, test_Celsius_Fahrenheit.celsius_fahrenheit(0));
    }

    @Test
    void fahrenheit_celsius() {

        assertEquals(0, test_celsius.fahrenheit_celsius(32));
        assertEquals(10, test_celsius.fahrenheit_celsius(50));
        assertEquals(50, test_celsius.fahrenheit_celsius(122));
        assertEquals(100, test_celsius.fahrenheit_celsius(212));
    }

    @Test
    void celsius_kelvin() {

        assertEquals(273.15, test_kelvin.celsius_kelvin(0));
        assertEquals(305.15, test_kelvin.celsius_kelvin(32));
        assertEquals(323.15, test_kelvin.celsius_kelvin(50));
        assertEquals(373.15, test_kelvin.celsius_kelvin(100));
    }

    @Test
    void testCelsius_toKelvin() {

        assertEquals(0, test_toKelvin.kelvin_celsius(273.15));
        assertEquals(32, test_toKelvin.kelvin_celsius(305.15));
        assertEquals(50, test_toKelvin.kelvin_celsius(323.15));
        assertEquals(100, test_toKelvin.kelvin_celsius(373.15));
    }

    @Test
    void esCapicua() {

        assertTrue(test_esCapicua.esCapicua(121));
        assertTrue(test_esCapicua.esCapicua(1221));
        assertTrue(test_esCapicua.esCapicua(12521));
        assertTrue(test_esCapicua.esCapicua(11111));
        assertFalse(test_esCapicua.esCapicua(245));
        assertFalse(test_esCapicua.esCapicua(2452));
        assertFalse(test_esCapicua.esCapicua(245857));
    }

    @Test
    void esPalindromo() {

        assertTrue(test_esPalindromo.esPalindromo("121"));
        assertTrue(test_esPalindromo.esPalindromo("1221"));
        assertTrue(test_esPalindromo.esPalindromo("Dabale arroz a la zorra el abad"));
        assertTrue(test_esPalindromo.esPalindromo("RaDar"));
        assertFalse(test_esPalindromo.esPalindromo("245"));
        assertFalse(test_esPalindromo.esPalindromo("Murcielago"));
        assertFalse(test_esPalindromo.esPalindromo("SUpercaLIfraGilistiCoesPialidoso"));
    }


}