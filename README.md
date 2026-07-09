Automatización QA - Demoblaze Store

Proyecto de automatización de pruebas funcionales para demoblaze.com, desarrollado con Selenium WebDriver, Screenplay Pattern, Serenity BDD y Cucumber.

1. Requisitos previos:
- Java 17
- Maven
- Google Chrome (última versión estable)
- IntelliJ IDEA (opcional, recomendado)

Estructura del proyecto:
src/main/java/org/example/
├── pages/            Page Objects (localizadores de la UI)
└── Tasks/            Tareas del patrón Screenplay

src/test/java/org/example/
├── stepDefinition/    Step Definitions (Cucumber)
└── RunnerTest.java    Clase runner de las pruebas

src/test/resources/features/
├── creacion_cuenta.feature
└── proceso_compra.feature

2. Cómo ejecutar las pruebas

Desde IntelliJ IDEA, clic derecho sobre RunnerTest.java
Seleccionar Run 'RunnerTest'

3. Ver el reporte de ejecución

Después de correr las pruebas, abrir en el navegador:
- target/site/serenity/index.html
Ahí se muestra el resumen de escenarios ejecutados, pasos, capturas de pantalla y el resultado (Pass/Fail) de cada uno.

4. Escenarios automatizados

- creacion_cuenta.feature: Registro de un nuevo cliente en el sitio
- proceso_compra.feature: Inicio de sesión, selección de un artículo y navegación al cesto.
