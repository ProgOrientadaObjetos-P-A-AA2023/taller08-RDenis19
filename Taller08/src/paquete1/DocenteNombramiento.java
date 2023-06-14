/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteNombramiento extends Docente{
    double valorSueldo;
    double valorHoraE;
    int numeroHorasE;
    double sueldo;

    public void establecerValorSueldo(double n) {
        valorSueldo = n;
    }

    public void establecerValorHorasExtra(double n) {
        valorHoraE = n;
    }

    public void establecerNumeroHorasExtra(int n) {
        numeroHorasE = n;
    }

    public void establecerSueldo() {
        sueldo = valorSueldo + (valorHoraE * numeroHorasE);
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHorasExtra() {
        return valorHoraE;
    }

    public int obtenerNumeroHorasExtra() {
        return numeroHorasE;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {

        return String.format("Ingrese los datos:"
                + "Nombre del docente: %s\n"
                + "Cedula del docenete: %s\n"
                + "Valor del sueldo: %.2f\n"
                + "Valor de horas extras: %.2f\n"
                + "Número de horas extras: %d\n"
                + "Sueldo: %.2f",
                obtenerNombre(),
                obtenerCedula(),
                obtenerValorSueldo(),
                obtenerValorHorasExtra(),
                obtenerNumeroHorasExtra(),
                obtenerSueldo());

    }

}
