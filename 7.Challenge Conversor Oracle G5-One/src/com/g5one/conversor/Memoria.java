package com.g5one.conversor;

/**
 *
 * @author Moises Romero
 */
public class Memoria {

    private double valor = 0;

    //CONVERTIR DISTANCIA DE METROS A UNIDAD SELECCIONADA
    public double Memoria(double valorConvertir, String convertirA) {
        switch (convertirA) {
            case "KB":
                this.valor = valorConvertir / 8192;
                break;
            case "MB":
                this.valor = valorConvertir / 8388608;
                break;            
            case "GB":
                this.valor = valorConvertir / 8589934592l;
                break;
            default:
                this.valor = 0;
                break;
        }
        return valor;
    }
}
