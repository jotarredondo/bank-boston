package com.cl.duocuc;

public class CuentaCorriente {
    private int numero;
    private int saldo;

    public CuentaCorriente(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("¡Depósito realizado de manera exitosa!");
        } else {
            System.out.println("Error: El monto debe ser mayor a 0.");
        }
    }

    public void girar(int monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor a 0.");
        } else if (monto > saldo) {
            System.out.println("Error: Saldo insuficiente.");
        } else {
            saldo -= monto;
            System.out.println("¡Giro realizado con éxito!");
        }
    }
}