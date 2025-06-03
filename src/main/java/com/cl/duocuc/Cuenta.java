package com.cl.duocuc;

import java.util.Random;

public abstract class Cuenta {

    protected String numeroCuenta;
    protected double saldo;

    public Cuenta() {
        this.numeroCuenta = generarNumeroCuenta();
        this.saldo = 0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
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

    private String generarNumeroCuenta() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
