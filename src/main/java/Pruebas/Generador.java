package Pruebas;

public class Generador {

    public String generadorletraDNI(int numero_dni) {
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int posicion = numero_dni%23;

        return String.valueOf(letra[posicion]).toUpperCase();
    }
}
