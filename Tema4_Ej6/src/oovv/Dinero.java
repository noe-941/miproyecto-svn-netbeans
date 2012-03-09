/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

/**
 *
 * @author PACKARD BELL
 */
public class Dinero {

    private int valor;//valor del dinero
    private int cantidad;//cantidad de unidades del cad de dinero

    /**
     * Constructor de la clase Dinero
     * @param valor
     * @param cantidad 
     */
    public Dinero(int valor, int cantidad) {
        this.valor = valor;
        this.cantidad = cantidad;
    }

    /**
     * Muestra el dinero y dependiendo si son billete o moneda en singular o plural
     * @return cadena de texto con lo que estamos representando
     */
    @Override
    public String toString() {
        String tipo = valor >= 500 ? " billete" : " moneda";
        if (cantidad > 1) {
            tipo += "s";
        }
        String cad = "";
        if (valor > 100) {
            cad = (int) (valor / 100) + " euros";
        } else if (valor == 100) {
            cad = "1 euro";
        } else if (valor == 1) {
            cad = "1 céntimo";
        } else {
            cad = valor + " céntimos";
        }
        return cantidad + tipo + " de " + cad;
    }

    void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}