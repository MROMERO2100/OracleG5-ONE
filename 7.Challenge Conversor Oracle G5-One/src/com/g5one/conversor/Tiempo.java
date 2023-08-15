package com.g5one.conversor;

/**
 *
 * @author Moises Romero
 */
public class Tiempo {

    private double valor = 0;

    //CONVERTIR DISTANCIA DE METROS A UNIDAD SELECCIONADA
    public double Tiempo(double valorConvertir, String convertirA) {
        switch (convertirA) {
            case "Minutos":
                this.valor = valorConvertir / 60;
                break;
            case "Horas":
                this.valor = valorConvertir / 3600;
                break;
            case "Dias":
                this.valor = valorConvertir / 86400;
                break;
            case "Semana":
                this.valor = valorConvertir / 604800;
                break;
            default:
                this.valor = 0;
                break;
        }
        return valor;
    }
}
