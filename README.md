# 🚀 Examen Teórico-Práctico Java (Java 17)

**Implementación de CRUD para Clientes y Préstamos con Java 17, Records, Pattern Matching y OpenAPI**

## 📌 Descripción
Proyecto que resuelve los ejercicios prácticos del examen senior, incluyendo:
- **CRUD de Clientes** usando `Records` y `Pattern Matching` para manejo de tipos.
- **CRUD de Préstamos** con cálculo dinámico de intereses según tipo de cliente (VIP/REGULAR).
- Documentación OpenAPI 2.0 y pruebas unitarias.

## 🛠 Tecnologías
- **Java 17** (Records, Pattern Matching, Sealed Classes*)
- **Maven** (Gestión de dependencias)
- **JUnit 5** (Pruebas unitarias)
- **Logback** (Logging estructurado)
- **OpenAPI 2.0** (Documentación API)

## 📂 Estructura del Proyecto
```bash
src/
├── main/
│   ├── java/com/ejemplo/
│   │   ├── model/       # Records y Enums
│   │   ├── service/     # Lógica de negocio
│   │   └── util/        # Utilidades (Logger)
│   └── resources/       # Configs y OpenAPI
└── test/                # Pruebas unitarias

## Requisitos
- Java 17

## Ejecución
```bash
mvn clean test