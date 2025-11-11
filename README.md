# 🎮 Patrones de Diseño

Repositorio de ejemplos prácticos de patrones de diseño orientados en tematica  de videojuegos.

## 📋 Índice

- [Introducción](#introducción)
- [Patrones Creacionales](#patrones-creacionales)
- [Patrones Estructurales](#patrones-estructurales)
- [Patrones de Comportamiento](#patrones-de-comportamiento)
- [Patrones Específicos de Juegos](#patrones-específicos-de-juegos)

---

## 🎯 Introducción

Los patrones de diseño son soluciones probadas a problemas comunes en el desarrollo de software. En videojuegos, estos patrones son esenciales para crear código mantenible, escalable y eficiente.

Este repositorio contiene implementaciones prácticas enfocadas en casos reales del desarrollo de videojuegos.

---

## 🏗️ Patrones Creacionales

Estos patrones se enfocan en la creación de objetos de manera eficiente y flexible.

### 🔹 Singleton
**Concepto:** Garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a ella.

**Casos de uso en videojuegos:**
- Game Manager (gestión del estado general del juego)
- Audio Manager (control centralizado de sonidos y música)
- Input Manager (manejo unificado de controles del jugador)
- Save Manager (sistema de guardado y carga)

### 🔹 Factory Method
**Concepto:** Define una interfaz para crear objetos, pero permite que las subclases decidan qué clase instanciar.

**Casos de uso en videojuegos:**
- Sistema de spawneo de enemigos según nivel o zona
- Creación de diferentes tipos de armas o items
- Generación de power-ups aleatorios
- Instanciación de diferentes tipos de proyectiles

### 🔹 Abstract Factory
**Concepto:** Proporciona una interfaz para crear familias de objetos relacionados sin especificar sus clases concretas.

**Casos de uso en videojuegos:**
- Temas visuales (medieval, futurista, fantasy)
- Kits de UI para diferentes plataformas
- Conjuntos de enemigos por bioma o región

### 🔹 Object Pool
**Concepto:** Reutiliza objetos en lugar de crearlos y destruirlos constantemente, mejorando el rendimiento.

**Casos de uso en videojuegos:**
- Pool de balas y proyectiles
- Partículas y efectos visuales
- Enemigos que respawnean continuamente
- Objetos del escenario que se reciclan

### 🔹 Prototype
**Concepto:** Crea nuevos objetos clonando instancias existentes.

**Casos de uso en videojuegos:**
- Duplicación de configuraciones de enemigos
- Clonación de items con propiedades similares
- Copia de configuraciones de niveles

---

## 🔧 Patrones Estructurales

Estos patrones se ocupan de cómo se componen las clases y objetos para formar estructuras más grandes.

### 🔹 Component
**Concepto:** Permite que un objeto cambie su comportamiento agregando o quitando componentes en lugar de usar herencia.

**Casos de uso en videojuegos:**
- Sistema de componentes de Unity/Unreal (Transform, Rigidbody, Collider)
- Habilidades modulares del jugador
- Características intercambiables de NPCs
- Comportamientos de IA intercambiables

### 🔹 Decorator
**Concepto:** Añade funcionalidad a un objeto de manera dinámica sin alterar su estructura original.

**Casos de uso en videojuegos:**
- Sistema de buffs y debuffs temporales
- Mejoras de armas (scope, silenciador, mira láser)
- Modificadores de estadísticas del personaje
- Efectos visuales adicionales sobre sprites

### 🔹 Facade
**Concepto:** Proporciona una interfaz simplificada para un conjunto complejo de subsistemas.

**Casos de uso en videojuegos:**
- Sistema de combate que coordina animaciones, sonido y física
- Sistema de diálogos que maneja UI, audio y lógica
- Sistema de logros que centraliza múltiples condiciones

### 🔹 Adapter
**Concepto:** Permite que interfaces incompatibles trabajen juntas.

**Casos de uso en videojuegos:**
- Integración de diferentes sistemas de input (teclado, gamepad, táctil)
- Compatibilidad entre diferentes APIs de audio
- Adaptadores para diferentes plataformas

---

## ⚙️ Patrones de Comportamiento

Estos patrones se centran en la comunicación entre objetos y cómo fluye la responsabilidad.

### 🔹 Observer
**Concepto:** Define una dependencia uno-a-muchos donde cuando un objeto cambia su estado, todos sus dependientes son notificados.

**Casos de uso en videojuegos:**
- Sistema de eventos (cuando el jugador recibe daño, muere, gana puntos)
- Actualización de UI cuando cambian las estadísticas
- Sistema de logros y achievements
- Notificaciones de cambios en el inventario

### 🔹 State

