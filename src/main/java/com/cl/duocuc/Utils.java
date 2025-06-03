package com.cl.duocuc;

import static com.cl.duocuc.Constants.LISTA_OPCIONES_MENU;
import static com.cl.duocuc.Constants.SALTO_DE_LINEA;

public class Utils {

    public static void mostrarBienvenida () {
        System.out.println(SALTO_DE_LINEA);
        System.out.println("*** Bienvenido a BankBoston ***");
        System.out.println("\n--- Menú ---");
        mostrarOpciones(LISTA_OPCIONES_MENU);
        System.out.println("Para continuar ingrese una opcion: ");
    }

    public static void mostrarOpciones(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("- " + (i + 1) + ": " + lista[i]);
        }
    }

    public static boolean validarEntradaCuenta (int cuenta) {
        if (cuenta > 0 && cuenta <= 3) {
            return true;
        } else {
            System.out.println("Ingrese una Opción válida");
            return false;
        }

    }
}
