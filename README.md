# Rizo_Arias-post1-u3

# TaskApp3 - Post-Contenido 1 | Unidad 3: Arquitectura de Aplicaciones Móviles

**Ingeniería de Sistemas - Universidad de Santander (UDES) - 2026**

Implementación de una aplicación Android simple de listado de tareas siguiendo el patrón **MVVM** con:

- **Jetpack Compose** para la UI declarativa.
- **ViewModel** + **StateFlow** para manejo de estado reactivo.
- **Hilt** para inyección de dependencias.
- **Repositorio simulado** (FakeTaskRepository) en memoria (sin Room ni base de datos real).
- **Kotlin** moderno y coroutines.

## Objetivo de la Actividad
Implementar una pantalla de listado de tareas aplicando MVVM con ViewModel, StateFlow y un repositorio simulado (FakeTaskRepository), utilizando Hilt como framework de inyección de dependencias en un proyecto Android con Kotlin y Jetpack Compose.

(Referencia: Post-Contenido 1 - Unidad 3 - Aplicaciones Móviles 2026)

## Estructura del Proyecto (Arquitectura Limpia / MVVM)

capturas/estructura.jpg

## Capturas de Pantalla (Checkpoints Completados)

### Checkpoint 1: Listado inicial de tareas (FakeRepository)
![Listado de tareas](capturas/listado-tareas-inicial.png)

### Checkpoint 2: Agregar nueva tarea (botón + StateFlow update)
![Agregar tarea](capturas/agregar-tarea.png)

### Checkpoint 3: Marcar tarea como completada (checkbox reactivo)
![Marcar completada](capturas/marcar-completada.png)


## Tecnologías Utilizadas
- Kotlin 2.0.20+ (o la versión que uses)
- Jetpack Compose (BOM 2024.09.00 o posterior)
- Hilt 2.51 para DI
- KSP para procesamiento de anotaciones
- StateFlow + viewModelScope para estado reactivo
- Gradle 8.10

## Cómo Ejecutar
1. Clona el repositorio: `git clone https://github.com/tuusuario/taskapp3-u3-post1-numael.git`
2. Abre en Android Studio (versión Hedgehog+)
3. Sync Gradle
4. Ejecuta en emulador API 26+ o dispositivo físico

## Commits Destacados
- Agrega estructura básica y dependencias Hilt/Compose/KSP
- Implementa entidad Task y TaskRepository en capa domain
- Agrega FakeTaskRepository con datos simulados
- Crea TaskViewModel con StateFlow para listado reactivo
- Implementa pantalla principal con LazyColumn y Compose UI

