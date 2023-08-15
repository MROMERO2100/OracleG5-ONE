package com.g5one.conversor;

/**
 *
 * @author Moises Romero
 */
public class Temperatura {

    private double valor = 0;

    //CONVERTIR DISTANCIA DE METROS A UNIDAD SELECCIONADA
    public double Temperatura(double valorConvertir, String convertirA) {
        switch (convertirA) {
            case "Grados Celsius":
                this.valor = valorConvertir + 273.15;
                break;
            case "Grados Fahrenheit":
                this.valor = (valorConvertir - 32) * 5 / 9 + 273.15;
                break;
            default:
                this.valor = 0;
                break;
        }
        return valor;
    }

}
