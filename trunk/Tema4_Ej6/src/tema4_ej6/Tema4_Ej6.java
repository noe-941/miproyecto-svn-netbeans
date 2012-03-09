/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4_ej6;

import oovv.Cajero;
import oovv.Cambio;
import oovv.Dinero;

/**
 *
 * @author PACKARD BELL
 */
public class Tema4_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dinero pasta = new Dinero(2000, 8);
        System.out.println(pasta);
        
        Cambio cambio = new Cambio();
        System.out.println(cambio);
        
        Cajero caja = new Cajero("Cajero1");
        System.out.println(caja);
    }
}
