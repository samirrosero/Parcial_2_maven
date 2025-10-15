package com.parcial2.modelo;
import com.parcial2.interfaces.Magico;
import java.util.ArrayList;
import java.util.List;

public class Mago extends Criatura implements Magico {
  private List<String> hechizos = new ArrayList<>();
  public Mago(String nombre, int salud, int fuerza) {
    super(nombre, salud, fuerza);
  }
  @Override
  public void atacar(Criatura objetivo) {
    int daño= fuerza;
    if (arma != null) daño += arma.getDañoAdicional();
    lanzarHechizo(objetivo);
    objetivo.defender(daño);
    System.out.println(nombre + " ataca a " + objetivo.nombre + " con un hechizo causando " + daño + " de daño.");
  }
  @Override
    public void defender(int daño) {
        salud -= daño;
        if (salud < 0) salud = 0;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }



}
