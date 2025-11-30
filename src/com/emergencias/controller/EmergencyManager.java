package com.emergencias.controller;

import com.emergencias.alert.AlertSender;
import com.emergencias.model.EmergencyEvent;

// Usamos el nombre de paquete completo para evitar ambigüedades
public class EmergencyManager {

    private com.emergencias.detector.detector detector;
    private AlertSender sender;

    public EmergencyManager(int umbralActivacion) {
        this.detector = new com.emergencias.detector.detector(umbralActivacion);
        this.sender = new AlertSender();
    }

    public void startSystem() {
        System.out.println("Sistema de emergencias iniciado.");

        EmergencyEvent event = detector.detectEvent();

        if (event != null) {
            System.out.println("Evento detectado: " + event);
            try {
                sender.sendAlert(event);
            } catch (Exception ex) {
                System.out.println("Error al enviar alerta: " + ex.getMessage());
            }
        } else {
            System.out.println("No se ha generado ninguna alerta.");
        }

        System.out.println("Sistema finalizado.");
    }
}


