/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62;
import static utilidades.Misc.*;

/**
 *
 * @author alumno
 */
public class JavaApplication62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("desde sara");
        System.out.println("hola");
        System.out.println("hola soc juanvi");
        int n = 0;
        while (n < 10) {
            System.out.println("hola");
            n--;
        }
        System.out.println("Numeros aleatorios:");
        for (int i = 0; i < 10; i++) {
            System.out.println(getEnteroAleatorio(0, 20));
        }
    }
}
