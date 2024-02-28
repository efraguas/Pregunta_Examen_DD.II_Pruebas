package Pruebas;

/**
 * @author Eric Fraguas
 */
public class Generador {
    /**
     * Este metodo genera la letra de un numero de Dni
     * @param numero_dni
     * @return la letra de un numero de Dni
     */
    public String generadorletraDNI(int numero_dni) {
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int posicion = numero_dni%23;

        return String.valueOf(letra[posicion]).toUpperCase();
    }
}
