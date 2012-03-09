/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author PACKARD BELL
 */
public class Misc {

    /**
     * Metodo para llenar el cajero entre 0 y 20 aleatoriamente
     * @param mat 
     */
    private static int[] llenaCajero(int[] mat) {
        for (int i = 0; i < mat.length; i++) {
            mat[i] = getEnteroAleatorio(0, 20);
        }
        return mat;
    }

    /**
     * Obtener un número aleatorio
     * @param valorInicial El número por el cual empieza
     * @param valorFinal El número en el que termina
     * @return Un número aleatorio entre el Inicial y el Final
     */
    public static int getEnteroAleatorio(int valorInicial, int valorFinal) {
        return valorInicial + (int) ((valorFinal - valorInicial + 1) * Math.random());
    }

    /**
     * formatea un número double.
     * agrupa los números, pone 3 decimales y 2 cifras enteras
     * @param numero
     * @return la cadena con el número formateado
     */
    public static String fDouble(double numero) {
        NumberFormat nf = NumberFormat.getInstance(Locale.UK);
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(3);
        nf.setMinimumIntegerDigits(2);
        return nf.format(numero);
    }

    public static int mcd(int numerador, int denominador) {
        int minimo = 0;
        int maximo = 0;
        if (numerador < denominador) {
            minimo = numerador;
            maximo = denominador;
        } else {
            minimo = denominador;
            maximo = numerador;
        }
        int divisor = minimo;
        while (maximo % divisor != 0 || minimo % divisor != 0) {
            divisor--;
        }
        return divisor;
    }
//    public static double cambiarTemperatura(Temperatura temp) {
//        if (temp.getEscala().equalsIgnoreCase("Fahrenheit")) {
//            return ((temp.getTemperatura() - 32) * (5.0 / 9));
//        } else {
//            return (9.0 / 5) * temp.getTemperatura() + 32;
//        }
//    }
}