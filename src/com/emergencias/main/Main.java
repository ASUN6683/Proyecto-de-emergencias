package com.emergencias.main;
import com.emergencias.controller.EmergencyManager;
public class Main {
    public static void main(String[] args) {
        // Umbral de activación: por ejemplo, 50
        int umbralActivacion = 50;

        // Creamos el gestor de emergencias
        EmergencyManager manager = new EmergencyManager(umbralActivacion);

        // Iniciamos el sistema (detecta y envía alertas)
        manager.startSystem();
    }
}
