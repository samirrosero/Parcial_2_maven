# 🐉 Simulador de Batallas de Criaturas

Este es un proyecto simple en **Java** y **Maven** que simula **batallas por turnos** entre diferentes tipos de criaturas fantásticas. El proyecto utiliza principios de **Programación Orientada a Objetos (POO)** como **herencia**, **polimorfismo** e **interfaces** para modelar el comportamiento de los combatientes.

## 👥 Integrantes
- **Valeri Solis**
- **Samir Rosero**

## 🧩 Clases del Modelo
El núcleo del proyecto se encuentra en el paquete `com.parcial2.modelo`, que contiene las siguientes clases:

### 🐾 Criatura.java
Clase base **abstracta** para todos los combatientes del juego. Define los atributos y comportamientos comunes que toda criatura debe tener.

**Atributos:**
- `nombre` *(String)*: El nombre de la criatura.  
- `salud` *(int)*: Los puntos de vida; si llegan a 0, la criatura es derrotada.  
- `fuerza` *(int)*: Determina el poder de sus ataques.  
- `arma` *(Arma)*: Un arma opcional que puede equiparse para aumentar el daño.

**Métodos clave:**
- `atacar(Criatura objetivo)`: Método abstracto que define cómo ataca la criatura.  
- `defender(int daño)`: Método abstracto que define cómo recibe daño.  
- `estaVivo()`: Devuelve `true` si la salud es mayor que 0.

### ⚔️ Guerrero.java
Representa a un combatiente especializado en el **combate cuerpo a cuerpo**.  
Hereda de `Criatura`. Su método `atacar()` inflige un daño basado en su fuerza más el daño adicional del arma que porte.

### 🧙‍♂️ Mago.java
Un lanzador de hechizos que puede realizar tanto ataques físicos débiles como potentes ataques mágicos.  
Hereda de `Criatura` e implementa la interfaz `Magico`. Puede `aprenderHechizo(String hechizo)`.  
Su método `lanzarHechizo(Criatura objetivo)` es su principal forma de ataque, causando un daño considerable.

### 🐉 Dragon.java
Una criatura mítica y poderosa, capaz de volar y realizar ataques devastadores.  
Hereda de `Criatura` e implementa la interfaz `Volador`.  
Su método `atacar()` multiplica su fuerza para calcular el daño, y posee los métodos `volar()` y `aterrizar()` de la interfaz `Volador`.

### 🗡️ Arma.java
Clase simple que representa un objeto equipable por cualquier criatura para potenciar sus ataques.  
**Atributos:**
- `nombre` *(String)*  
- `dañoAdicional` *(int)*

## 🧠 Interfaces
- **Magico.java**: Define el contrato para las criaturas que pueden usar magia (`lanzarHechizo`, `aprenderHechizo`).  
- **Volador.java**: Define el contrato para las criaturas que pueden volar (`volar`, `aterrizar`).

## 🚀 Cómo Ejecutar el Proyecto

### 1️⃣ Ejecutar la Demostración
Puedes ejecutar una batalla de demostración directamente desde la clase `Main.java`. Esta simulará un par de combates e imprimirá los resultados en la consola.

### 2️⃣ Ejecutar las Pruebas Unitarias (JUnit)
El proyecto está configurado con **JUnit 5** para realizar pruebas estructuradas.  
Para ejecutarlas:

1. Abre una terminal en la raíz del proyecto.  
2. Ejecuta el siguiente comando:

```bash
mvn test
