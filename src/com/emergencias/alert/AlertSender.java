package com.emergencias.alert;
import com.emergencias.model.EmergencyEvent;

import java.io.FileWriter;

public class AlertSender {

    public void sendAlert(EmergencyEvent event) {
        if (event == null) {
            System.out.println("No hay emergencia.");
            return;
        }

        System.out.println("Enviando alerta a 112...");
        System.out.println("Impacto: " + event.getFuerzaImpacto());
        System.out.println("Personas: " + event.getNumOcupantes());
        System.out.println("Movimiento: no hay movimiento");
        System.out.println("Ubicación: " + event.getUbicacion());

        try (FileWriter writer = new FileWriter("alertas.txt", true)) {
            writer.write(event.toString() + "\n");
        } catch (Exception e) {
            System.out.println("Error guardando alerta.");
        }
    }
}


