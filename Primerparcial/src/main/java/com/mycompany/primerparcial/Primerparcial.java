/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primerparcial;

import java.util.Scanner;
public class Primerparcial {

static Scanner entrada = new Scanner(System.in);

    static int cantidadEmpleados = 0;
    static double sumaSalarios = 0;

    public static void main(String[] args) {

        int opcionMenu;

        do {

            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Registrar empleado y calcular salario");
            System.out.println("2. Mostrar resumen de pagos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcionMenu = n();

            switch (opcionMenu) {

                case 1 -> registrarEmpleado();

                case 2 -> mostrarResumen();

                case 3 -> System.out.println("Programa finalizado.");

                default -> System.out.println("Opcion invalida.");
            }

        } while (opcionMenu != 3);
    }

    public static int n() {

        while (true) {

            try {

                int numero = entrada.nextInt();

                if (numero <= 0) {
                    throw new Exception();
                }

                return numero;

            } catch (Exception e) {

                System.out.print("Error. Ingrese un numero valido: ");
                entrada.nextLine();
            }
        }
    }

    public static void registrarEmpleado() {
entrada.nextLine();

        System.out.print("Nombre del empleado: ");
        String nombreEmpleado = entrada.nextLine();

        double horasTrabajadas = leerDecimal("Horas trabajadas en la semana: ");
        double tarifaHora = 60;

        double pagoNormal = calcularPagoNormal(horasTrabajadas, tarifaHora);
        double pagoExtra = calcularPagoExtra(horasTrabajadas, tarifaHora);
        double pagoTotal = calcularPagoTotal(pagoNormal, pagoExtra);

        System.out.println("\nEmpleado: " + nombreEmpleado);
        System.out.println("Pago normal: Q" + pagoNormal);
        System.out.println("Pago horas extra: Q" + pagoExtra);
        System.out.println("Pago total: Q" + pagoTotal);

        cantidadEmpleados++;
        sumaSalarios += pagoTotal;
    }

    public static void mostrarResumen() {
    
     System.out.println("\n===== RESUMEN DE PAGOS =====");

        System.out.println("Cantidad de empleados registrados: " + cantidadEmpleados);
        System.out.println("Total pagado en salarios: Q" + sumaSalarios);

        if (cantidadEmpleados > 0) {

            double promedioSalario = sumaSalarios / cantidadEmpleados;
            System.out.println("Promedio de salario pagado: Q" + promedioSalario);

        } else {

            System.out.println("Promedio de salario: Q0");

        }
      } 

public static double calcularPagoNormal(double horasTrabajadas, double tarifaHora) {
    if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaHora;
        } else {
            return 40 * tarifaHora;
        }
    }

    public static double calcularPagoExtra(double horasTrabajadas, double tarifaHora) {
    if (horasTrabajadas > 40) {
        double horasExtra = horasTrabajadas - 40;
        return horasExtra * (tarifaHora * 1.5);
    }   
    return 0;
}
    public static double calcularPagoTotal(double pagoNormal, double pagoExtra) {

    return pagoNormal + pagoExtra;
    }

    public static double leerDecimal(String horas_trabajadas_en_la_semana_) {
        while (true) {
        try {
            System.out.print("Horas trabajadas en la semana: ");
            double numero = entrada.nextDouble();

            if (numero <= 0) {
                throw new Exception();
            }

            return numero;

        } catch (Exception e) {

            System.out.println("Error. Ingrese un numero valido.");
            entrada.nextLine();
        }
    }
  }
}
     
