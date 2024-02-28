package Pruebas;

import java.util.Locale;

public class Conversor {
    public double celsius_fahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public double fahrenheit_celsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public double celsius_kelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    public double kelvin_celsius(double kelvin) {
        double celsius = kelvin - 273.15;
        return celsius;
    }

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


    public boolean esPalindromo(String palabra) {

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
