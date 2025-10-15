package com.parcial2.modelo;

public class Guerrero extends Criatura {
    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        if (arma != null)
            daño += arma.getDañoAdicional();
        System.out.println("El guerrero " + nombre + " ataca a " + objetivo.nombre + " con un daño de " + daño);
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println("El guerrero " + nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }

}
