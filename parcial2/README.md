# Simulador de Batallas de Criaturas

Este es un proyecto simple en Java y Maven que simula batallas por turnos entre diferentes tipos de criaturas fantásticas. El proyecto utiliza principios de Programación Orientada a Objetos como herencia, polimorfismo e interfaces para modelar el comportamiento de los combatientes.

## Integrantes

Este proyecto fue desarrollado por:

*   Valeri Solis
*   Samir Rosero

---

## Clases del Modelo

El núcleo del proyecto se encuentra en el paquete `com.parcial2.modelo`, que contiene las siguientes clases:

### `Criatura.java`

Es la clase base **abstracta** para todos los combatientes del juego. Define los atributos y comportamientos comunes que toda criatura debe tener.

*   **Atributos:**
    *   `nombre` (String): El nombre de la criatura.
    *   `salud` (int): Los puntos de vida. Si llegan a 0, la criatura es derrotada.
    *   `fuerza` (int): Un valor que determina el poder de sus ataques.
    *   `arma` (Arma): Un arma opcional que puede equiparse para aumentar el daño.
*   **Métodos clave:**
    *   `atacar(Criatura objetivo)`: Método abstracto para definir cómo ataca la criatura.
    *   `defender(int daño)`: Método abstracto para definir cómo recibe daño.
    *   `estaVivo()`: Devuelve `true` si la salud de la criatura es mayor que 0.

### `Guerrero.java`

Representa a un combatiente especializado en el combate cuerpo a cuerpo.
*   Hereda de `Criatura`.
*   Su método `atacar` inflige un daño basado en su `fuerza` más el daño adicional del `arma` que porte.

### `Mago.java`

Un lanzador de hechizos que puede realizar tanto ataques físicos débiles como potentes ataques mágicos.
*   Hereda de `Criatura` e implementa la interfaz `Magico`.
*   Puede `aprenderHechizo(String hechizo)`.
*   Su método `lanzarHechizo(Criatura objetivo)` es su principal forma de ataque, causando un daño considerable.

### `Dragon.java`

Una criatura mítica y poderosa, capaz de volar y realizar ataques devastadores.
*   Hereda de `Criatura` e implementa la interfaz `Volador`.
*   Su método `atacar` es especialmente poderoso, multiplicando su `fuerza` para calcular el daño.
*   Posee los métodos `volar()` y `aterrizar()` de la interfaz `Volador`.

### `Arma.java`

Una clase simple que representa un objeto equipable por cualquier `Criatura` para potenciar sus ataques.
*   **Atributos:** `nombre` y `dañoAdicional`.

---

## Interfaces

*   **`Magico.java`**: Define el contrato para las criaturas que pueden usar magia (`lanzarHechizo`, `aprenderHechizo`).
*   **`Volador.java`**: Define el contrato para las criaturas que pueden volar (`volar`, `aterrizar`).

---

## Cómo Ejecutar el Proyecto

### 1. Ejecutar la Demostración

Puedes ejecutar una batalla de demostración directamente desde la clase `Main.java`. Esta simulará un par de combates e imprimirá los resultados en la consola.

### 2. Ejecutar las Pruebas Unitarias (JUnit)

El proyecto está configurado con JUnit 5 para realizar pruebas estructuradas. Para ejecutar las pruebas de batalla definidas en `src/test/java`:

1.  Abre una terminal en la raíz del proyecto.
2.  Ejecuta el siguiente comando de Maven:
    ```bash
    mvn test
    ```
Maven compilará el código y ejecutará todas las clases de prueba, mostrando un resumen de los resultados.