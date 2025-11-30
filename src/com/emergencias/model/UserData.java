package com.emergencias.model;

public class UserData {
    private String nombre;
    private String telefono;
    private String infoClinica;

    public UserData(String nombre, String telefono, String infoClinica) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.infoClinica = infoClinica;
    }
        @Override
        public String toString() {
            return nombre + " (" + telefono + ") - " + infoClinica;
        }
    }

