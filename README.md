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
**Concepto:** Permite que un objeto altere su comportamiento cuando su estado interno cambia.

**Casos de uso en videojuegos:**
- Estados del jugador (idle, corriendo, saltando, atacando, muerto)
- Estados de enemigos (patrullando, persiguiendo, atacando, huyendo)
- Estados del juego (menú, jugando, pausado, game over)
- Estados de IA

### 🔹 Command
**Concepto:** Encapsula una solicitud como un objeto, permitiendo parametrizar clientes con diferentes solicitudes.

**Casos de uso en videojuegos:**
- Sistema de replay y grabación de partidas
- Sistema de deshacer/rehacer acciones
- Configuración personalizable de teclas
- Cola de acciones en juegos por turnos
- Macros y combos

### 🔹 Strategy
**Concepto:** Define una familia de algoritmos, encapsula cada uno y los hace intercambiables.

**Casos de uso en videojuegos:**
- Diferentes comportamientos de IA (agresivo, defensivo, balanceado)
- Sistemas de pathfinding intercambiables (A*, Dijkstra)
- Diferentes algoritmos de generación procedural
- Modos de dificultad

### 🔹 Chain of Responsibility
**Concepto:** Permite que múltiples objetos tengan la oportunidad de manejar una solicitud.

**Casos de uso en videojuegos:**
- Sistema de manejo de colisiones (por capas o prioridad)
- Pipeline de efectos de sonido
- Procesamiento de input con prioridades
- Sistema de ayuda contextual

---

## 🎲 Patrones Específicos de Juegos

Patrones desarrollados específicamente para resolver problemas comunes en videojuegos.

### 🔹 Game Loop
**Concepto:** Ciclo principal que procesa entrada, actualiza el estado del juego y renderiza, ejecutándose continuamente.

**Casos de uso en videojuegos:**
- Motor principal del juego
- Sincronización de física y renderizado
- Control de framerate

### 🔹 Update Method
**Concepto:** Simula una colección de objetos independientes diciendo a cada uno que procese un frame de comportamiento.

**Casos de uso en videojuegos:**
- Actualización de entidades del juego
- Sistema de partículas
- Actualización de componentes

### 🔹 Double Buffer
**Concepto:** Utiliza dos buffers para evitar mostrar estados intermedios durante el renderizado.

**Casos de uso en videojuegos:**
- Renderizado de gráficos sin parpadeos
- Actualización de física sin glitches visuales
- Procesamiento de audio suave

### 🔹 Dirty Flag
**Concepto:** Evita trabajo innecesario marcando datos que han cambiado y necesitan ser recalculados.

**Casos de uso en videojuegos:**
- Actualización de transformaciones jerárquicas
- Recálculo de pathfinding solo cuando cambia el mapa
- Actualización de gráficos de escena solo cuando hay cambios

### 🔹 Service Locator
**Concepto:** Proporciona un punto de acceso global a servicios sin acoplar al código con sus implementaciones concretas.

**Casos de uso en videojuegos:**
- Acceso a sistemas de audio, gráficos, input
- Servicios de red y multijugador
- Sistemas de analíticas y telemetría

### 🔹 Spatial Partition
**Concepto:** Organiza objetos en el espacio para hacer búsquedas más eficientes.

**Casos de uso en videojuegos:**
- Quadtree/Octree para detección de colisiones
- Grid-based pathfinding
- Culling de objetos fuera de cámara
- Sistemas de LOD (Level of Detail)

---

## 📁 Estructura del Repositorio
```
📦 Patrones-de-Diseño
├── 📂 Creacionales/
│   ├── Singleton/
│   ├── Factory/
│   ├── ObjectPool/
│   └── Prototype/
├── 📂 Estructurales/
│   ├── Component/
│   ├── Decorator/
│   └── Facade/
├── 📂 Comportamiento/
│   ├── Observer/
│   ├── State/
│   ├── Command/
│   └── Strategy/
└── 📂 EspecificosJuegos/
    ├── GameLoop/
    ├── UpdateMethod/
    └── SpatialPartition/
```

---

## 🚀 Cómo usar este repositorio

Cada carpeta contiene:
- Implementación práctica del patrón
- Ejemplo aplicado a un contexto de videojuego
- Comentarios explicativos en el código
- Casos de uso recomendados

---

## 📚 Referencias

- **Game Programming Patterns** - Robert Nystrom
- **Design Patterns: Elements of Reusable Object-Oriented Software** - Gang of Four
- **Unity Documentation** - Patrones y mejores prácticas

---

## 👥 Contribuciones

Las contribuciones son bienvenidas. Por favor:
1. Fork el proyecto
2. Crea una rama para tu feature
3. Commit tus cambios
4. Push a la rama
5. Abre un Pull Request

---

## 📝 Licencia

Este proyecto está bajo la Licencia MIT.

---

**Desarrollado con** ❤️ **para la comunidad de desarrollo de videojuegos**

