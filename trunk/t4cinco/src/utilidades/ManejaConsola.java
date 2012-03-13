/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *metodos para el manejo de la consola.
 * @author Administrador
 */
public class ManejaConsola {

    private static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
/**
     * Lee un numero double.
     * @return Un double
     * @throws IOException 
     */
    public static double LeeDouble() throws IOException {

        boolean incorrecto = true;
        do {
            try {
                incorrecto = true;
                double valor = Double.parseDouble(lector.readLine());
                return valor;
            } catch (NumberFormatException e) {
            }

        } while (incorrecto);
        return -1;
    }

    /**Lee un numero Entero
     *metodos para el manejo de la consola.
     * @author Administrador
     **/
    public static int LeeEntero() throws IOException {
        boolean incorrecto = true;
        do {
            try {
                incorrecto = true;
                int valor = Integer.parseInt(lector.readLine());
                return valor;
            } catch (NumberFormatException e) {
            }

        } while (incorrecto);
        return -1;
    }
/**
     * Lee una cadena de Texto.
     * @return
     * @throws IOException 
     */
    public static String leerCadena() throws IOException {
        return lector.readLine();
    }
}
