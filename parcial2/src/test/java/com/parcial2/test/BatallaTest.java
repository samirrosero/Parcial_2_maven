package com.parcial2.test;
import com.parcial2.modelo.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
public class BatallaTest {
    private Guerrero guerrero;
    private Mago mago;
    private Arma espada;
    private Arma varita;
    private Dragon dragon;

    @BeforeEach
    public void setUp() {
        guerrero = new Guerrero("Conan", 100, 20);
        mago = new Mago("Gandalf", 80, 15);
        espada = new Arma("Espada Larga", 10);
        varita = new Arma("Varita Mágica", 8);
        dragon = new Dragon("Smaug", 150, 30);

    }

    @Test
    public void testEquiparArma(){
        guerrero.equiparArma(espada);
        Assertions.assertEquals("Espada Larga", guerrero.arma.getNombre());
    }
    @Test
    public void testAtaqueGuerreroReducirSaludMago(){
        guerrero.equiparArma(espada);
        int saludInicial = mago.salud;
        guerrero.atacar(mago);
        Assertions.assertTrue(mago.salud < saludInicial);
    }

    @Test
    public void testAprenderYlanzarHechizo(){
        mago.aprenderHechizo("Bola de Fuego");
        Assertions.assertFalse(mago.hechizos.isEmpty());
        mago.lanzarHechizo(guerrero);
    }

    @Test
    public void testMagoAtacaGuerrero(){
        mago.equiparArma(varita);
        int saludInicial = guerrero.salud;
        mago.atacar(guerrero);
        Assertions.assertTrue(guerrero.salud < saludInicial);
    }

    @Test
    public void testDragonAtacaConDobleFuerzaz (){
        int saludInicial = guerrero.salud;
        dragon.atacar(guerrero);
        Assertions.assertTrue(guerrero.salud < saludInicial - dragon.fuerza);
    }
    @Test
    public void testDragonAtacaMago(){
        int saludInicial = mago.salud;
        dragon.atacar(mago);
        Assertions.assertTrue(mago.salud < saludInicial - dragon.fuerza);
    }
    @Test
    public void testCriaturasVivenDespuesDeAtaque(){
        guerrero.atacar(mago);
        mago.atacar(guerrero);
        dragon.atacar(guerrero);
        dragon.atacar(mago);
        Assertions.assertTrue(guerrero.estaVivo());
        Assertions.assertTrue(mago.estaVivo());
    }
    @Test
    public void testDragonLanzaFuegoYAtaca(){
        dragon.equiparArma(new Arma("Llamarada", 15));
        int saludInicial = mago.salud;
        dragon.atacar(mago);
        Assertions.assertTrue(mago.salud < saludInicial - dragon.fuerza);
    }

    @Test 
    public void testDefenderMago(){
        int saludInicial = mago.salud;
        mago.defender(20);
        Assertions.assertEquals(saludInicial - 20, mago.salud);
    }

    @Test
    public void testDefenderGuerrero(){
        int saludInicial = guerrero.salud;
        guerrero.defender(25);
        Assertions.assertEquals(saludInicial - 25, guerrero.salud);
    }
    @Test
    public void criaturasMuerenDespuesDeMuchosAtaques(){
        for (int i = 0; i < 10; i++) {
            guerrero.atacar(mago);
            if (!mago.estaVivo()) break;
        }
        Assertions.assertFalse(mago.estaVivo());
    }
}


