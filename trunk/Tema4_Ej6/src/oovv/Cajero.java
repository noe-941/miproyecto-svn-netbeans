/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import sun.management.snmp.util.MibLogger;
import utilidades.Misc;

/**
 *
 * @author PACKARD BELL
 */
public class Cajero {

    private String ubicacion;//ubicación del cajero
    private Cambio dineroDisponible;//Dinero disponible en el cajero para cambiar

    public Cajero(String ubicacion) {
        this.ubicacion = ubicacion;
        this.dineroDisponible = llenaCaja();
    }

    private Cambio llenaCaja() {
        Cambio cambio = new Cambio();
        for (int i = 0; i < ValoresBM.Valores.length; i++) {
            cambio.setCantidad(Misc.getEnteroAleatorio(3, 10), i);
        }
        return cambio;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
