package Pruebas;

import java.util.Locale;

/**
 * @author Eric Fraguas
 */
public class Conversor {
    /**
     * Metodo para convertir grados Celsius a Fahrenheit
     * @param celsius valor en grados celsius
     * @return grados Fahrenheit
     */
    public double celsius_fahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
    /**
     * Metodo para convertir grados Fahrenheit a Celsius
     * @param fahrenheit valor en grados Fahrenheit
     * @return grados Celsius
     */
    public double fahrenheit_celsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    /**
     * Metodo para convertir grados Celsius a kelvin
     * @param celsius valor en grados celsius
     * @return grados Kelvin
     */
    public double celsius_kelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    /**
     * Metodo para convertir grados Kelvin a Celsius
     * @param kelvin valor en grados Kelvin
     * @return grados Celsius
     */
    public double kelvin_celsius(double kelvin) {
        double celsius = kelvin - 273.15;
        return celsius;
    }

    /**
     * Metodo que comprueba si el numero introducido es capicua
     * @param numero valor a comprobar
     * @return True si es capicua
     */
    public boolean esCapicua(int numero) {
        String numeroStr = String.valueOf(numero);
        int longitud = numeroStr.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (numeroStr.charAt(i) != numeroStr.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que comprueba si la palabra introducida es un palindromo
     * (se lee igual de izquierda a derecha)
     * @param palabra palabra a comprobar
     * @return True si es es un palindromo
     */
    public boolean esPalindromo(String palabra) {
        //Eliminamos los espacios por si se introducen frases y se formatea a minusculas
        String palabraFormat = palabra.replace(" ", "").toLowerCase();
        int longitud = palabraFormat.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (palabraFormat.charAt(i) != palabraFormat.charAt(longitud - i - 1)) {
                return false;
            }
        }

        return true;
    }



}
