package com.parcial2.modelo;

public class Arma {
    private String nombre;
    private int daño;

    public Arma(String nombre, int daño) {
        this.nombre = nombre;
        this.daño = daño;
    }

   public  int getDañoAdicional() {
        return daño;
    }

    public String getNombre() {
        return nombre;
    }

    public int atacarConArma (Criatura objetivo, int fuerzaBase) {
        int dañoTotal = fuerzaBase + daño;
        objetivo.defender(dañoTotal);
        System.out.println("El arma ⚔️ " + nombre + " ataca a " + objetivo.nombre + " con un daño total de " + dañoTotal);
        return dañoTotal;
    }
}
