package com.g5one.conversor;

/**
 *
 * @author Moises Romero
 */
public class Distancia {

    private double valor = 0;

    //CONVERTIR DISTANCIA DE METROS A UNIDAD SELECCIONADA
    public double Distancia(double valorConvertir, String convertirA) {
        switch (convertirA) {
            case "Centimetros":
                this.valor = valorConvertir * 100;
                break;
            case "Kilometros":
                this.valor = valorConvertir / 1000;
                break;
            case "Millas":
                this.valor = valorConvertir / 1609.344;
                break;
            case "Pies":
                this.valor = valorConvertir * 3.281;
                break;
            default:
                this.valor = 0;
                break;
        }
        return valor;
    }
}
