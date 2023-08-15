package com.g5one.conversor;

/**
 *
 * @author Moises Romero
 */
public class Masa {

    private double valor = 0;

    //CONVERTIR DISTANCIA DE METROS A UNIDAD SELECCIONADA
    public double Masa(double valorConvertir, String convertirA) {
        switch (convertirA) {
            case "Miligramos":
                this.valor = valorConvertir * 4536000;
                break;
            case "Gramos":
                this.valor = valorConvertir * 453.6;
                break;
            case "Kilogramos":
                this.valor = valorConvertir / 2.205;
                break;
            case "Toneladas":
                this.valor = valorConvertir / 2205;
                break;
            default:
                this.valor = 0;
                break;
        }
        return valor;
    }
}
