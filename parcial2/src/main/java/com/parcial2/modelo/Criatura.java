package com.parcial2.modelo;

public abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;
    protected Arma arma;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public abstract void atacar(Criatura objetivo);

    public abstract void defender(int daño);

    public boolean estaVivo() {
        return salud > 0;
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

}
