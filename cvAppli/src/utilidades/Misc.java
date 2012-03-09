/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author alumno
 */
public class Misc {

    /**
     * genera un valor aleatorio.
     *
     * @param valorInicial
     * @param valorFinal
     * @return un double entre los valores indicados
     */
    public static double getDouble(double valorInicial, double valorFinal) {
        double parteEntera = valorInicial + (valorFinal - valorInicial + 1) * Math.random();
        double parteDecimal = (1000 * Math.random()) / 1000;
        return parteEntera + parteDecimal;
    }

    /**
     * formatea un double.
     * 
     * @param numero
     * @return el número formateado
     */
    public static String nfDecimales(double numero) {
        NumberFormat nf = NumberFormat.getInstance(Locale.UK);
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(3);
        return nf.format(numero);
    }

    public static int getEnteroAleatorio(int valorInicial, int valorFinal) {
        return valorInicial + (int) ((valorFinal - valorInicial + 1) * Math.random());
    }
}
