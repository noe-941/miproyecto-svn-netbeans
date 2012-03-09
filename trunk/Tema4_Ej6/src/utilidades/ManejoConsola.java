/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author PACKARD BELL
 */
public class ManejoConsola {

    private static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Metodo que lee un valor double por teclado
     * @return valor leido de teclado
     * @throws IOException 
     */
    public static double leeDouble() throws IOException {
        boolean incorrecto = false;
        do {
            try {
                double valor = Double.parseDouble(lector.readLine());
                return valor;
            } catch (NumberFormatException e) {
                incorrecto = true;
            }
        } while (incorrecto);
        return -1;
    }

    /**
     * Metodo que lee un valor double por teclado
     * @return valor leido de teclado
     * @throws IOException 
     */
    public static int leeEntero() throws IOException {
        boolean incorrecto = true;
        do {
            try {
                int valor = Integer.parseInt(lector.readLine());
                return valor;
            } catch (NumberFormatException e) {
            }
        } while (incorrecto);
        return -1;
    }

    public static void mostrarMensaje(String texto) {
        System.out.println(texto);
    }

    /**
     * Metodo que lee una cadena por teclado
     * @return valor leido de teclado
     * @throws IOException 
     */
    public static String leeCadena() throws IOException {
        return lector.readLine();
    }
}
