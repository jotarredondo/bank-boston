package com.cl.duocuc;

    public class Cliente implements ClienteInterface {
        private String rut;
        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private String domicilio;
        private String comuna;
        private String telefono;
        private Cuenta cuenta;

        public Cliente(String rut, String nombre, String apellidoPaterno,
                       String apellidoMaterno, String domicilio,
                       String comuna, String telefono, int numeroCuenta) {

            this.rut = rut;
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.domicilio = domicilio;
            this.comuna = comuna;
            this.telefono = telefono;
            this.cuenta = setTipoCuenta(numeroCuenta);
        }

        private Cuenta setTipoCuenta(int numeroCuenta) {
            if (numeroCuenta == 1) {
                return new CuentaCorriente();
            } else if (numeroCuenta == 2) {
                return new CuentaAhorro();
            } else {
                return new CuentaCredito();
            }
        }

        public String getRut() {
            return rut;
        }

        public void setRut(String rut) {
            this.rut = rut;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidoMaterno() {
            return apellidoMaterno;
        }

        public void setApellidoMaterno(String apellidoMaterno) {
            this.apellidoMaterno = apellidoMaterno;
        }

        public String getApellidoPaterno() {
            return apellidoPaterno;
        }

        public void setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
        }

        public String getComuna() {
            return comuna;
        }

        public void setComuna(String comuna) {
            this.comuna = comuna;
        }

        public String getDomicilio() {
            return domicilio;
        }

        public void setDomicilio(String domicilio) {
            this.domicilio = domicilio;
        }

        public Cuenta getCuenta() {
            return cuenta;
        }

        public void setCuenta(Cuenta cuenta) {
            this.cuenta = cuenta;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        @Override
        public void mostrarDatos() {
                System.out.println("Rut: " + rut);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido paterno: " + apellidoPaterno);
                System.out.println("Apellido materno: " + apellidoMaterno);
                System.out.println("Domicilio: " + domicilio);
                System.out.println("Comuna: " + comuna);
                System.out.println("Teléfono: " + telefono);
                System.out.println("Cuenta Corriente:  " + cuenta.getNumeroCuenta());
        }
    }
