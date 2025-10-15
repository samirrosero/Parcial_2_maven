package com.parcial2.modelo;

import com.parcial2.interfaces.Volador;

public class Dragon extends Criatura implements Volador {
    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza * 2;
        if (arma != null) daño += arma.getDañoAdicional();
        objetivo.defender(daño);
        System.out.println("El dragón " + nombre + " ataca a " + objetivo.nombre + " con un daño de " + daño);{
            objetivo.defender(daño);
        }
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println("El dragón " + nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void volar() {
        System.out.println("El dragón " + nombre + " está volando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El dragón " + nombre + " ha aterrizado.");
    }


    
}
