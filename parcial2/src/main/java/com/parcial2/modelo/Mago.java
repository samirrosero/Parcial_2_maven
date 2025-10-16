
package com.parcial2.modelo;
import com.parcial2.interfaces.Magico;
import java.util.ArrayList;
import java.util.List;

public class Mago extends Criatura implements Magico {
    public List<String> hechizos = new ArrayList<>();

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza; // Los magos hacen más daño con hechizos
        if (arma != null) daño += arma.getDañoAdicional();
        System.out.println(nombre + "🧙‍♂️  ataca a " + objetivo.nombre +  " causando " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + "🧙‍♂️ recibe " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void lanzarHechizo(Criatura objetivo) {
        if (hechizos.isEmpty()) {
            System.out.println(nombre + "🧙‍♂️  no conoce hechizos aún.");
        } else {
            System.out.println(nombre + "🧙‍♂️  lanza " + hechizos.get(0) + " sobre " + objetivo.nombre + " !");
        }
    }

    @Override
    public void aprenderHechizo(String hechizo) {
        hechizos.add(hechizo);
        System.out.println(nombre + "🧙‍♂️  ha aprendido el hechizo: " + hechizo);
    }





}
 