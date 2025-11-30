package com.emergencias.model;

public class EmergencyEvent {
    private String tipoEmergencia;
    private String ubicacion;
    private String infoUsuario;
    private double fuerzaImpacto;
    private int numOcupantes;
    private boolean hayMovimiento;

    public EmergencyEvent(String tipoEmergencia, String ubicacion, String infoUsuario, double fuerzaImpacto, int numOcupantes) {
        if (tipoEmergencia == null || ubicacion == null) {
            throw new IllegalArgumentException("tipo y ubicacion son obligatorios");
        }
        this.tipoEmergencia = tipoEmergencia;
        this.ubicacion = ubicacion;
        this.infoUsuario = infoUsuario;
        this.fuerzaImpacto = fuerzaImpacto;
        this.numOcupantes = numOcupantes;
        this.hayMovimiento = true;
    }
    // Nuevo constructor para detector
    public EmergencyEvent(int fuerzaImpacto, int numOcupantes, boolean hayMovimiento, String ubicacion) {
        this.tipoEmergencia = "Accidente detectado";
        this.fuerzaImpacto = fuerzaImpacto;
        this.numOcupantes = numOcupantes;
        this.hayMovimiento = hayMovimiento;
        this.ubicacion = ubicacion;
        this.infoUsuario = null;
    }
    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getInfoUsuario() {
        return infoUsuario;
    }

    public double getFuerzaImpacto() {
        return fuerzaImpacto;
    }

    public int getNumOcupantes() {
        return numOcupantes;
    }

    @Override
    public String toString() {
        return "Emergencia: " + tipoEmergencia +
                " | Ubicación: " + ubicacion +
                " | Fuerza impacto: " + fuerzaImpacto +
                " | Ocupantes: " + numOcupantes +
                (infoUsuario != null ? " | Info: " + infoUsuario : "");
    }
}


