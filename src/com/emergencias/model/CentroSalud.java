package com.emergencias.model;

public class CentroSalud {
    public String Nombre;
    public String Municipio;
    public  String Teléfono;
    public double Latitud;
    public double Longitud;


    public CentroSalud(String nombre, String municipio, String telefono) {
        this.Nombre = nombre;
        this.Municipio = municipio;
        this.Teléfono= telefono;
        this.Latitud= Latitud;
        this.Longitud= Longitud;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public String getTelefono() {
        return Teléfono;
    }

    public double getLatitud() {
        return Latitud;
    }

    public double getLongitud() {
        return Longitud;
    }

    @Override
    public String toString() {
        return "CentroSalud{" +
                "nombre='" + Nombre + '\'' +
                ", municipio='" + Municipio + '\'' +
                ", telefono='" + Teléfono+ '\'' +
                '}';
    }
}
