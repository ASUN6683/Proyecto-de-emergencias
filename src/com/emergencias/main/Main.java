package com.emergencias.main;
import com.emergencias.controller.EmergencyManager;
import com.emergencias.model.CentroSalud;
import com.emergencias.service.CentroSaludService;

import com.emergencias.service.HistorialEmergencias;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Cargar centros de salud desde JSON
        ArrayList<CentroSalud> centros = CentroSaludService.cargarCentros();

        System.out.println("Centros cargados: " + centros.size());

        for (int i = 0; i < 5; i++) {
            System.out.println(centros.get(i));
        }
        for (CentroSalud c:centros){
            System.out.println(c);
        }
        //Iniciar sistema de emergencias
        int umbralActivacion = 50;
        EmergencyManager manager =new EmergencyManager(umbralActivacion);
        manager.startSystem();

        //Guardar la emergencia en fichero
        HistorialEmergencias.guardarEmergencia("Accidente", "Calle Mayor");
    }
}
