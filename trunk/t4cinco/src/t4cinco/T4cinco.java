/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t4cinco;

import java.io.IOException;
import oovv.Fraccion;
import utilidades.ManejaConsola;

/**
 *
 * @author Administrador
 */
public class T4cinco {

    /**
     * @param args the command line arguments
     */
    static Fraccion fraccion;
    static Fraccion fraccion2;

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /**
         * 5.	Crea una clase que permita representar un fracción,
         * las acciones que podemos realizar son, asignar, ver, sumar,
         * restar, multiplicar, dividir y simplificar (la simplificación 
         * consiste en dividir por el máximo común divisor). Realiza un 
         * programa que permite operar con fracciones.
         */
        int opcion = 0;
        setFraccion();
        do {
            System.out.println("Elige una opcion:\n1- Sumar\n2- Restar\n"
                    + "3- Multiplicar\n4- Dividir\n5- Simplificar\n"
                    + "6- Cambiar de fracciones\n0- Salir");
            opcion = ManejaConsola.LeeEntero();
            switch (opcion) {
                case 1:
                    System.out.println(fraccion.Suma(fraccion2));
                    break;
                case 2:
                    System.out.println(fraccion.Resta(fraccion2));
                    break;
                case 3:
                    System.out.println(fraccion.Multiplicar(fraccion2));
                    break;
                case 4:
                    System.out.println(fraccion.Dividir(fraccion2));
                    break;
                case 5:
                    System.out.println(fraccion.Simplificar());
                    break;
                case 6:
                    setFraccion();
            }

        } while (opcion != 0);
        System.out.println("Fin de Programa");

    }

    private static void setFraccion() throws IOException {
        System.out.println("Introduce el numerador de la fraccion 1");
        int num = ManejaConsola.LeeEntero();
        System.out.println("Introduce el denominador de la fraccion 1");
        int den = ManejaConsola.LeeEntero();
        System.out.println("Introduce el numerador de la fraccion 2");
        int num1 = ManejaConsola.LeeEntero();
        System.out.println("Introduce el denominador de la fraccion 2");
        int den1 = ManejaConsola.LeeEntero();
        fraccion = new Fraccion(num, den);
        fraccion2 = new Fraccion(num1, den1);
    }
}
