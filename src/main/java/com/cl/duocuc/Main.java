package com.cl.duocuc;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.cl.duocuc.Constants.*;
import static com.cl.duocuc.Utils.mostrarBienvenida;
import static com.cl.duocuc.Utils.validarEntradaCuenta;

public class Main {
    public static void main(String[] args) {
        //Inicializando clase Scanner
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente = null;
        int opcion, numCuenta;
        boolean opcionCuenta;

        do {
            mostrarBienvenida();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    try {
                    System.out.println(INGRESE_RUT);
                    String rut = sc.nextLine();
                    System.out.println(INGRESE_NOMBRE);
                    String nombre = sc.nextLine();
                    System.out.println(INGRESE_APELLIDO_PATERNO);
                    String apPaterno = sc.nextLine();
                    System.out.println(INGRESE_APELLIDO_MATERNO);
                    String apMaterno = sc.nextLine();
                    System.out.println(INGRESE_DOMICILIO);
                    String domicilio = sc.nextLine();
                    System.out.println(INGRESE_COMUNA);
                    String comuna = sc.nextLine();
                    System.out.println(INGRESE_TELEFONO);
                    String telefono = sc.nextLine();
                    do {
                        System.out.println("Ingrese : ");
                        System.out.println("1._ Si desea crear una Cuenta Corriente : ");
                        System.out.println("2._ Si desea crear una Cuenta Ahorro : ");
                        System.out.println("3._ Si desea crear una Cuenta Credito : ");
                        numCuenta = sc.nextInt();
                        opcionCuenta = validarEntradaCuenta(numCuenta);
                    } while (!opcionCuenta);
                        cliente = new Cliente(rut, nombre, apPaterno, apMaterno, domicilio, comuna, telefono, numCuenta);
                        System.out.println("¡Cliente registrado con éxito!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error al registrar cliente: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (cliente != null) {
                        cliente.mostrarDatos();
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
