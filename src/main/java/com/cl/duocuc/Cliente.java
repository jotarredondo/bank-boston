package com.cl.duocuc;

    public class Cliente {
        private String rut;
        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private String domicilio;
        private String comuna;
        private String telefono;
        private CuentaCorriente cuenta;

        public Cliente(String rut, String nombre, String apellidoPaterno,
                       String apellidoMaterno, String domicilio,
                       String comuna, String telefono, int numeroCuenta) {

            rut = rut.trim();

            if (rut.length() < 11 || rut.length() > 12) {
                throw new IllegalArgumentException("RUT inválido. Debe tener entre 11 y 12 caracteres.");
            }


            if (!rut.matches("\\d{1,2}\\.\\d{3}\\.\\d{3}-[\\dkK]")) {
                throw new IllegalArgumentException("RUT inválido. Formato esperado: 12.345.678-9");
            }

            this.rut = rut;
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.domicilio = domicilio;
            this.comuna = comuna;
            this.telefono = telefono;
            this.cuenta = new CuentaCorriente(numeroCuenta);
        }

        public CuentaCorriente getCuenta() {
            return cuenta;
        }

        public void verDatos() {
            System.out.println("Rut: " + rut);
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido paterno: " + apellidoPaterno);
            System.out.println("Apellido materno: " + apellidoMaterno);
            System.out.println("Domicilio: " + domicilio);
            System.out.println("Comuna: " + comuna);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Cuenta Corriente:  " + cuenta.getNumero());
        }
    }
