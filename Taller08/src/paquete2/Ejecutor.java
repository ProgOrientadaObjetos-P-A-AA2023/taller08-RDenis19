/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        while (bandera) {

            System.out.print("Ingrese\n"
                    + "1 para crear el nombramiento de un docente\n"
                    + "2 para crear la factura de un docente\n");
            String opcion = entrada.nextLine();

            if ("1".equals(opcion) || "2".equals(opcion)) {

                System.out.print("Ingrese los nombres del docente:");
                String nombres = entrada.nextLine();
                System.out.print("Ingrese la cédula del docente:");
                String cedula = entrada.nextLine();

                if ("1".equals(opcion)) {

                    System.out.print("Ingrese el sueldo del docente:\n");
                    double valorSueldo = entrada.nextDouble();
                    System.out.print("Ingrese el valor de la hora extra:\n");
                    double valorHorasExtra = entrada.nextDouble();
                    System.out.print("Ingrese el número de horas extra:\n");
                    int numHoras = entrada.nextInt();
                    entrada.nextLine();
                    
                    DocenteNombramiento docenteN = new DocenteNombramiento();
                                        
                    docenteN.establecerNombre(nombres);
                    docenteN.establecerCedula(cedula);
                    docenteN.establecerValorSueldo(valorSueldo);
                    docenteN.establecerValorHorasExtra(valorHorasExtra);
                    docenteN.establecerNumeroHorasExtra(numHoras);                    
                    docenteN.establecerSueldo();

                    System.out.println(docenteN);
                    
                } else if ("2".equals(opcion)) {

                    System.out.print("Ingrese el valor de la factura:\n");
                    double valorFactura = entrada.nextDouble();
                    System.out.print("Ingrese el valor iva del descuento:\n");
                    double valorIvaDescuento = entrada.nextDouble();
                    entrada.nextLine();
                    
                    DocenteFactura factura = new DocenteFactura();
 
                    factura.establecerNombre(nombres);
                    factura.establecerCedula(cedula);
                    factura.establecerValorFactura(valorFactura);
                    factura.establecerValorIva(valorIvaDescuento);
                    factura.establecerCancelar();
                    System.out.println(factura);
                }

            } else {
                System.out.println("Opción incorrecta, no existe");
            }
            
            System.out.print("\nIngrese (N) para salir del programa:");
            String salida = entrada.nextLine();
            if ("N".equals(salida)) {
                bandera = false;
            }

        }

    }

}