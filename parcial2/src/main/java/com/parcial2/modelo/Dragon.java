package com.parcial2.modelo;

import com.parcial2.interfaces.Volador;

public class Dragon extends Criatura implements Volador {
    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dañoBase = fuerza * 2;
        if (arma != null) {
            System.out.println("🔥 El dragón " + nombre + " lanza un poderoso ataque con su arma " + arma.getNombre());
            arma.atacarConArma(objetivo, dañoBase);
        } else {
            objetivo.defender(dañoBase);
            System.out.println("🔥 El dragón " + nombre + " ataca causando " + dañoBase + " de daño.");
        }
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println("🔥 El dragón " + nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void volar() {
        System.out.println("🔥 El dragón " + nombre + " está volando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("🔥 El dragón " + nombre + " ha aterrizado.");
    }

}
