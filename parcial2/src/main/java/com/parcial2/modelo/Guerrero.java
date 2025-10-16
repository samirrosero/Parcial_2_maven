package com.parcial2.modelo;

public class Guerrero extends Criatura {
    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        if (arma != null) {
            System.out.println("🪖El guerrero " + nombre + " ataca con su arma " + arma.getNombre());
            arma.atacarConArma(objetivo, fuerza);
        } else {
            System.out.println("🪖El guerrero "+ nombre + " ataca con las manos.");
            objetivo.defender(fuerza);
        }
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println("🪖El guerrero " + nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }

}
