package com.cl.duocuc;

import static com.cl.duocuc.Constants.*;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente() {
    }

    @Override
    public String getNumeroCuenta() {
        return super.getNumeroCuenta();
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void depositar(double monto) {
        super.depositar(monto);
        System.out.println(DEPOSITO_EXITO + " " + CUENTA_CORRIENTE + ": " + getNumeroCuenta());
    }

    @Override
    public void girar(int monto) {
        super.girar(monto);
    }


}