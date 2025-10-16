package com.parcial2.modelo;

public class SimulacionBatalla {
    // vamos a simular una batalla entre dos criaturas
    public static void iniciarBatalla(Criatura c1, Criatura c2) {
        System.out.println("⚔️ Inciando batalla entre " + c1.nombre + " y " + c2.nombre + " ⚔️");

        int turno = 1;

        while (c1.estaVivo() && c2.estaVivo()){
            System.out.println("\n--- Turno " + turno + " ---");
            // c1 ataca a c2
            if (c1.estaVivo()) {
                c1.atacar(c2);
            }

            // c2 ataca a c1
            if (c2.estaVivo()) {
                c2.atacar(c1);
            }
            System.out.println("\nEstado de la batalla: " + c1.nombre + " (Salud: " + c1.salud + ") vs " + c2.nombre + " (Salud: " + c2.salud + ")");
            turno++;

            // pausa entre turnos para mejor visualización
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // prevenir bucle infinito
            if (turno > 20) {
                System.out.println("La batalla ha terminado en empate por límite de turnos.");
                break;
            }
        }

        // determinar el ganador
        System.out.println("\n--- Batalla Terminada ---");
        if (c1.estaVivo() && !c2.estaVivo()) {
            System.out.println("🏆 " + c1.nombre + " ha ganado la batalla!");
        } else if (!c1.estaVivo() && c2.estaVivo()) {
            System.out.println("🏆 " + c2.nombre + " ha ganado la batalla!");
        } else {
            System.out.println("La batalla terminó en empate.");
        }
        
    }
}
