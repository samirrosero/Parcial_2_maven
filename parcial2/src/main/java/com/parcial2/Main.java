package com.parcial2;
import com.parcial2.modelo.*;
public class Main {
    public static void main(String[] args) {
      Arma espada = new Arma("Espada legendaria", 10);
        Arma fuego = new Arma("Llama infernal", 15);

        Guerrero guerrero = new Guerrero("Thorin", 100, 20);
        Mago mago = new Mago("Gandalf", 90, 15);
        Dragon dragon = new Dragon("Smaug", 120, 25);

        mago.aprenderHechizo("Rayo destructor");
        guerrero.equiparArma(espada);
        dragon.equiparArma(fuego);

        // Simulaciones de batallas
        SimulacionBatalla.iniciarBatalla(guerrero, mago);
        System.out.println("\n==============================\n");
        SimulacionBatalla.iniciarBatalla(dragon, mago);
    }
}