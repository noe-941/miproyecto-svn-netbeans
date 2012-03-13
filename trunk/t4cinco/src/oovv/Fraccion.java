/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class Fraccion {

    /**
     * 5.	Crea una clase que permita representar un fracción,
     * las acciones que podemos realizar son, asignar, ver, sumar,
     * restar, multiplicar, dividir y simplificar (la simplificación 
     * consiste en dividir por el máximo común divisor). Realiza un 
     * programa que permite operar con fracciones.
     */
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public Fraccion Suma(Fraccion otraFraccion) {
        int numeradorfi = numerador + otraFraccion.numerador;
        if (numerador == otraFraccion.denominador) {
            int denominadorfi = numerador;
            return new Fraccion(numeradorfi, denominadorfi);
        }
        int denominadorfi = numerador + otraFraccion.denominador;
        return new Fraccion(numeradorfi, denominadorfi);
    }

    public Fraccion Resta(Fraccion otraFracion) {
        int numeradorfi = numerador - otraFracion.numerador;
        int denominadorfi = numerador - otraFracion.denominador;
        return new Fraccion(numeradorfi, denominadorfi);
    }

    public Fraccion Multiplicar(Fraccion otraFraccion) {
        int numeradorfi = numerador * otraFraccion.numerador;
        int denominadorfi = numerador * otraFraccion.denominador;
        return new Fraccion(numeradorfi, denominadorfi);
    }

    public Fraccion Dividir(Fraccion otraFraccion) {
        int numeradorfi = numerador / otraFraccion.numerador;
        int denominadorfi = denominador / otraFraccion.denominador;
        return new Fraccion(numeradorfi, denominadorfi);
    }

    public double Simplificar() {
        double divisor = denominador;
        while (divisor > 0) {
            if (denominador % divisor == 0 && divisor % denominador == 0) {
                return denominador;
            }
            divisor--;
        }
        return denominador;
    }

    @Override
    public String toString() {
        return "Fraccion: " + numerador + "/" + denominador;
    }
}
