/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteFactura extends Docente{
    double valorFactura;
    double valorIva;
    double cancelar;

     public void establecerValorFactura(double n) {
        valorFactura = n;
    }

    public void establecerValorIva(double n) {
        valorIva = n;
    }

    public void establecerCancelar() {
        cancelar = valorFactura - (valorFactura * valorIva) / 100;
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerValorIva() {
        return valorIva;
    }

    public double obtenerCancelar() {
        return cancelar;
    }

    @Override
    public String toString() {

        return String.format("Nombre del docente: %s\n"
                + "Cédula del docente: %s\n"
                + "Valor de la Factura: %.2f\n"
                + "Valor iva de descuento: %.2f\n"
                + "Valor a cancelar: %.2f",
                obtenerNombre(),
                obtenerCedula(),
                obtenerValorFactura(),
                obtenerValorIva(),
                obtenerCancelar());

    }

}
