/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

/**
 *
 * @author PACKARD BELL
 */
public class Cambio {

    private Dinero[] cambio;

    public Cambio() {
        this.cambio = new Dinero[ValoresBM.getValores().length];
        for (int i = 0; i < cambio.length; i++) {
            cambio[i] = new Dinero(ValoresBM.getValores()[i], 0);
        }
    }

    public void setCantidad(int cantidad, int indice) {
        cambio[indice].setCantidad(cantidad);
    }
    
    public void setCambio(Dinero[] cambio) {
        this.cambio = cambio;
    }
    
    
    

    @Override
    public String toString() {
        String cad = "";
        for (int i = 0; i < cambio.length; i++) {
            cad += cambio[i] + "\n";
        }
        return cad;
    }
}
