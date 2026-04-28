# Práctica: Navegación de Pantallas con Jetpack Compose

Este proyecto es una aplicación de Android desarrollada con **Kotlin** y **Jetpack Compose** que simula la interfaz de usuario de una red social (estilo Instagram). El objetivo principal de la práctica es demostrar la estructuración de pantallas, el uso de componentes de Material Design 3 y la organización de la interfaz mediante `LazyColumn`, `LazyVerticalGrid` y navegación.

## 🚀 Características

La aplicación consta de tres pantallas principales:

1.  **Home (Inicio):**
    *   `CenterAlignedTopAppBar` con acciones interactivas.
    *   Lista de publicaciones dinámicas generadas con `LazyColumn`.
    *   Componentes de interacción (Botón de Like).
2.  **Explore (Explorar):**
    *   Barra de búsqueda personalizada mediante `OutlinedTextField`.
    *   Cuadrícula de contenido sugerido utilizando `LazyVerticalGrid`.
3.  **Profile (Perfil):**
    *   Resumen estadístico del usuario (Posts, Seguidores, Seguidos).
    *   Información biográfica.
    *   Botón interactivo de "Editar Perfil".
    *   Muestra de fotos previas en formato de cuadrícula.

## 🛠️ Tecnologías Utilizadas

*   **Lenguaje:** [Kotlin](https://kotlinlang.org/)
*   **Framework de UI:** [Jetpack Compose](https://developer.android.com/jetpack/compose)
*   **Diseño:** Material Design 3 (Material3)
*   **Navegación:** Navigation Compose (v2.8.7)
*   **Iconografía:** Material Icons Extended

## 📂 Estructura del Código

El archivo principal de las interfaces se encuentra en:
`app/src/main/java/ni/edu/uam/navegacion_pantalla/Screens.kt`

*   **`HomeScreen()`**: Estructura principal de noticias.
*   **`ExploreScreen()`**: Interfaz de búsqueda y descubrimiento.
*   **`ProfileScreen()`**: Resumen de cuenta y biografía.
*   **`PostItem()`**: Componente reutilizable para las tarjetas de publicaciones.

## 📋 Requisitos de la Práctica cumplidos

- [x] **Títulos Identificadores:** Cada pantalla cuenta con un `TopAppBar` que indica la sección actual.
- [x] **Componentes Interactivos:** Implementación de botones, campos de texto y elementos de lista clickeables.
- [x] **Diseño Adaptable:** Uso de pesos (`weights`) y modificadores para asegurar que la UI se vea bien en distintos tamaños de pantalla.

## 🔧 Instalación y Ejecución

1.  Clona este repositorio:
    
