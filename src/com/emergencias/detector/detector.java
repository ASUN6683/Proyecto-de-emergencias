package com.emergencias.detector;

import com.emergencias.model.EmergencyEvent;
import java.util.Scanner;

public class detector {

    private int umbralActivacion;
    private Scanner sc;

    // Constructor que recibe el umbral de activación
    public detector(int umbralActivacion) {
        if (umbralActivacion < 0) {
            throw new IllegalArgumentException("Umbral inválido.");
        }
        this.umbralActivacion = umbralActivacion;
        this.sc = new Scanner(System.in);
    }

    // Método principal que detecta la emergencia
    public EmergencyEvent detectEvent() {
        System.out.println("¿Ha habido un impacto fuerte? (S/N)");
        if (!sc.nextLine().equalsIgnoreCase("S")) return null;

        System.out.println("Fuerza del impacto (0-100): ");
        int impacto = Integer.parseInt(sc.nextLine());

        System.out.println("¿Cuántas personas hay a bordo?: ");
        int personas = Integer.parseInt(sc.nextLine());

        System.out.println("¿Hay movimiento en las personas? (S/N): ");
        boolean movimiento = sc.nextLine().equalsIgnoreCase("S");

        System.out.println("Ubicación del vehículo: ");
        String ubicacion = sc.nextLine();

        // Validamos contra el umbral
        if (impacto < umbralActivacion) {
            System.out.println("Impacto menor que el umbral. No se considera emergencia.");
            return null;
        }

        // Creamos y devolvemos un evento de emergencia
        return new EmergencyEvent("Accidente", ubicacion, null, impacto, personas);
    }
    //nueva caracteristica
    public boolean comprobarCinturon() {
        try {
            // Lógica simulada
            return true; // sensor activado
        } catch (Exception e) {
            System.out.println("Error al comprobar cinturón: " + e.getMessage());
            return false;
        }
    }

    // Método adicional para pruebas unitarias sin usar consola
    public EmergencyEvent simulateEvent(boolean impactoFuerte, int fuerza, int numOcupantes, boolean movimiento, String ubicacion) {
        if (!impactoFuerte || fuerza < umbralActivacion) {
            return null;
        }
        return new EmergencyEvent("Accidente", ubicacion, null, fuerza, numOcupantes);
    }

    }






