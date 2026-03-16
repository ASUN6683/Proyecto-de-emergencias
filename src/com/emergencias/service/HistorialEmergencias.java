package com.emergencias.service;

import java.io.FileWriter;
import java.io.IOException;
public class HistorialEmergencias {
    public static void guardarEmergencia(String tipo, String ubicacion) {

        try {
            FileWriter writer = new FileWriter("historial_emergencias.txt", true);

            writer.write("Emergencia: " + tipo + " - Ubicación: " + ubicacion + "\n");

            writer.close();

            System.out.println("Emergencia guardada en el archivo.");

        } catch (IOException e) {

            System.out.println("Error al guardar la emergencia.");
        }
    }
}
