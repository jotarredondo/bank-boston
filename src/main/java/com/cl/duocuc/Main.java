package com.cl.duocuc;


import java.util.Scanner;

import static com.cl.duocuc.Utils.mostrarBienvenida;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = null;
        int opcion;

        do {
            mostrarBienvenida();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    String rut;
                    System.out.print("Ingrese Rut (formato 12.345.678-9): ");
                    rut = sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese apellido paterno: ");
                    String apPaterno = sc.nextLine();
                    System.out.print("Ingrese apellido materno: ");
                    String apMaterno = sc.nextLine();
                    System.out.print("Ingrese domicilio: ");
                    String domicilio = sc.nextLine();
                    System.out.print("Ingrese comuna: ");
                    String comuna = sc.nextLine();
                    System.out.print("Ingrese teléfono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Ingrese número de cuenta (9 dígitos): ");
                    int numCuenta = sc.nextInt();
                    sc.nextLine();

                    try {
                            cliente = new Cliente(rut, nombre, apPaterno, apMaterno, domicilio, comuna, telefono, numCuenta);
                        System.out.println("¡Cliente registrado con éxito!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error al registrar cliente: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (cliente != null) {
                        cliente.verDatos();
                    } else {
                        System.out.println("Debe registrar un cliente primero.");
                    }
                    break;

                case 3:
                    if (cliente != null) {
                        System.out.print("Ingrese monto a depositar: ");
                        int monto = sc.nextInt();
                        cliente.getCuenta().depositar(monto);
                        System.out.println("Saldo actual: " + cliente.getCuenta().getSaldo() + " pesos");
                    } else {
                        System.out.println("Debe registrar un cliente primero.");
                    }
                    break;

                case 4:
                    if (cliente != null) {
                        System.out.print("Ingrese monto a girar: ");
                        int monto = sc.nextInt();
                        cliente.getCuenta().girar(monto);
                        System.out.println("Saldo actual: " + cliente.getCuenta().getSaldo() + " pesos");
                    } else {
                        System.out.println("Debe registrar un cliente primero.");
                    }
                    break;

                case 5:
                    if (cliente != null) {
                        System.out.println("Saldo actual: " + cliente.getCuenta().getSaldo() + " pesos");
                    } else {
                        System.out.println("Debe registrar un cliente primero.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        sc.close();
        }
    }
