# Proyecto AutoSafe Sensor

## Descripción
Sistema de Detección Automática de Emergencias en Vehículos (AutoSafe Sensor) desarrollado en Java.  
Detecta impactos, número de ocupantes, movimiento de las personas y envía alertas simuladas a servicios de emergencia.

## Estructura del Proyecto
- `src/main/java/com/emergencias/model` → Clases de datos (EmergencyEvent, UserData)
- `src/main/java/com/emergencias/detector` → Detector de emergencias
- `src/main/java/com/emergencias/alert` → Envío de alertas (AlertSender)
- `src/main/java/com/emergencias/controller` → Coordinador del sistema (EmergencyManager)
- `src/main/java/com/emergencias/main` → Punto de entrada (Main.java)
- `src/test/java` → Tests de `detectEvent()` y `sendAlert()`

## Funcionalidades
- Detecta impacto y fuerza del golpe
- Recuento de ocupantes
- Detecta movimiento de personas
- Envío de alerta simulada a 112
- Validación de umbral para evitar falsos positivos

## Tecnologías
- Java SE
- Estructura OOP con clases independientes
- Persistencia básica en archivos de texto
- Tests unitarios con JUnit 5
