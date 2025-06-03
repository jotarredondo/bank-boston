package com.cl.duocuc;

import static com.cl.duocuc.Constants.CUENTA_CREDITO;
import static com.cl.duocuc.Constants.DEPOSITO_EXITO;

public class CuentaCredito extends Cuenta {

    public CuentaCredito()  {
        super();
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public String getNumeroCuenta() {
        return super.getNumeroCuenta();
    }

    @Override
    public void depositar(double monto) {
        super.depositar(monto);
        System.out.println(DEPOSITO_EXITO + " " + CUENTA_CREDITO + ": " + getNumeroCuenta());
    }

    @Override
    public void girar(int monto) {
        super.girar(monto);
    }

}
