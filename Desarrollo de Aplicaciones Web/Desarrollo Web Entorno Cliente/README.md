# ES Desarrollo Web en Entorno Cliente

**Centro de Estudios:**  Universidad Alfonso X el Sabio.

**Profesor:** Francisco Javier Segovia.
#
La asignatura de **Desarrollo Web en Entorno Cliente** se enfoca en el desarrollo del front-end de una aplicación web, es decir, la parte que interactúa directamente con el usuario. Esta área abarca el diseño y la implementación de la interfaz de usuario (UI), la experiencia de usuario (UX), y la lógica que se ejecuta en el navegador:

1. **Introducción al Desarrollo Web en Entorno Cliente**:
   - **Cliente-servidor**: Se introduce el modelo de arquitectura cliente-servidor, explicando cómo el cliente (generalmente el navegador web) solicita recursos al servidor y cómo se manejan las respuestas del lado del cliente.
   - **Lenguajes del entorno cliente**: Se presenta la tríada básica de tecnologías que se utilizan en el lado del cliente: **HTML**, **CSS**, y **JavaScript**. Estos lenguajes son fundamentales para crear interfaces interactivas y dinámicas.

2. **HTML (Lenguaje de Marcado de Hipertexto)**:
   - **Estructura del HTML**: Aprender a crear la estructura básica de una página web utilizando etiquetas HTML. Incluye el uso correcto de etiquetas como `<header>`, `<nav>`, `<section>`, `<footer>`, etc.
   - **Elementos HTML**: Uso de diversos elementos HTML como listas (`<ul>`, `<ol>`), tablas (`<table>`), formularios (`<form>`), imágenes (`<img>`), y vínculos (`<a>`).
   - **Semántica web**: Importancia de utilizar etiquetas semánticas para mejorar la accesibilidad y el SEO (Optimización en Motores de Búsqueda). Se exploran etiquetas como `<article>`, `<aside>`, `<main>`, y `<figure>`.

3. **CSS (Hojas de Estilo en Cascada)**:
   - **Estilización con CSS**: Aprender a aplicar estilos a una página web utilizando **CSS**. Se exploran propiedades como colores, tipografías, márgenes, bordes, y alineación.
   - **Selectores CSS**: Uso de diferentes tipos de selectores en CSS (por id, clase, tipo de elemento, *pseudoclases*) para aplicar estilos específicos a elementos HTML.
   - **Box Model**: Se estudia el *modelo de caja* en CSS, que incluye los márgenes, bordes, rellenos (*padding*) y el contenido del elemento.
   - **Layouts en CSS**: Técnicas modernas de diseño web, como el uso de *Flexbox* y *CSS Grid* para crear *layouts* complejos y adaptables.
   - **Responsive Design**: Introducción al diseño responsive usando *media queries* para adaptar el diseño de una página web a diferentes tamaños de pantalla (dispositivos móviles, tablets, escritorio).

### 4. **JavaScript**:
   - **Fundamentos de JavaScript**: Introducción a la programación en **JavaScript**, el lenguaje de programación del lado del cliente más utilizado para añadir interactividad a las páginas web.
     - Variables, tipos de datos y operadores.
     - Estructuras de control (condicionales y bucles).
     - Funciones y eventos.
   - **DOM (Document Object Model)**: Manipulación del DOM con JavaScript, permitiendo modificar la estructura y contenido de una página web en respuesta a eventos del usuario (clics, movimientos del ratón, cambios en el formulario, etc.).
   - **Eventos en JavaScript**: Aprender a manejar eventos, como `click`, `mouseover`, `keydown`, entre otros, para crear interacciones dinámicas en la página.
   - **AJAX (Asynchronous JavaScript and XML)**: Introducción a la técnica **AJAX** para realizar solicitudes asíncronas al servidor sin tener que recargar toda la página, permitiendo la actualización de contenido dinámico.

5. **Programación Asíncrona**:
   - **Promesas y Fetch API**: Uso de **promesas** para manejar operaciones asíncronas en JavaScript y la **Fetch API** para realizar peticiones HTTP a servidores y manejar datos en formato JSON o XML.
   - **Async/Await**: Uso de las palabras clave `async` y `await` para simplificar la escritura de código asíncrono en JavaScript, facilitando la lectura y gestión de flujos asíncronos.

6. **Frameworks y Librerías JavaScript**:
   - **jQuery**: Aunque ha perdido popularidad en favor de los frameworks más modernos, en algunos cursos se enseña **jQuery** por su facilidad para manipular el DOM y gestionar eventos de manera eficiente.
   - **React.js**: Se puede enseñar **React**, una de las bibliotecas más populares para el desarrollo de interfaces de usuario dinámicas y basadas en componentes. En este tema se cubre:
     - Componentes y su ciclo de vida.
     - Estado y propiedades (state y props).
     - Creación de aplicaciones SPA (Single Page Applications).
   - **Vue.js o Angular**: Dependiendo del curso, también se puede incluir una introducción a otros frameworks de JavaScript como **Vue.js** o **Angular**.

7. **Diseño Responsivo y Mobile First**:
   - **Media Queries**: Uso de **media queries** en CSS para diseñar sitios web que se adapten a diferentes tamaños de pantalla, desde móviles hasta pantallas de escritorio.
   - **Frameworks CSS**: Se introduce el uso de **frameworks de diseño responsive** como **Bootstrap**, que proporciona un conjunto de herramientas y componentes predefinidos para acelerar el desarrollo de interfaces que se ajusten automáticamente a distintos dispositivos.
   - **Mobile First**: Se enseña la filosofía de diseño **mobile-first**, en la que el diseño y desarrollo de la web comienza con las pantallas móviles y luego se adapta progresivamente a pantallas más grandes.

8. **Control de Versiones**:
   - **Git y GitHub**: Uso de **Git** para el control de versiones de los proyectos de desarrollo web. Se enseña cómo utilizar los comandos básicos de Git (clonar, agregar, commit, push, pull, branch) y cómo colaborar en proyectos con **GitHub** u otros servicios de repositorios remotos.

9. **Optimización del Rendimiento del Front-End**:
   - **Optimización de imágenes y recursos**: Técnicas para reducir el tamaño de las imágenes y optimizar recursos como hojas de estilo y scripts para mejorar la velocidad de carga de la página.
   - **Minificación y concatenación**: Reducción del tamaño de los archivos CSS y JavaScript mediante **minificación** (eliminación de espacios en blanco y comentarios) y **concatenación** (combinación de archivos).
   - **Lazy Loading**: Carga diferida de imágenes y otros recursos para mejorar el rendimiento de la página.
   - **CDN (Content Delivery Network)**: Uso de **CDNs** para cargar archivos estáticos (como CSS, JavaScript y fuentes) desde servidores distribuidos globalmente, mejorando la velocidad de carga.

10. **Accesibilidad Web (WAI-ARIA)**:
   - **Buenas prácticas de accesibilidad**: Se enseña a desarrollar sitios web accesibles para personas con discapacidades, siguiendo las pautas de accesibilidad web (WCAG).
   - **WAI-ARIA (Web Accessibility Initiative – Accessible Rich Internet Applications)**: Uso de las especificaciones **WAI-ARIA** para mejorar la accesibilidad de las aplicaciones web dinámicas, haciendo que los elementos interactivos sean más fáciles de usar para los usuarios con discapacidades.

11. **SEO (Search Engine Optimization)**:
   - **Optimización para motores de búsqueda**: Se enseñan las técnicas básicas de **SEO** para mejorar la visibilidad de un sitio web en los motores de búsqueda.
   - **Metaetiquetas y estructura semántica**: Uso adecuado de las **metaetiquetas** (`<meta>`), y de las etiquetas HTML semánticas (`<h1>`, `<title>`, etc.) para mejorar la clasificación en los motores de búsqueda.
   - **Contenido optimizado**: Se explica la importancia del contenido relevante y optimizado para mejorar el ranking en los motores de búsqueda.

12. **Testing y Debugging en el Entorno Cliente**:
   - **Depuración de código**: Uso de las herramientas de desarrollo de los navegadores (como Chrome DevTools) para **depurar** código JavaScript, CSS y analizar el rendimiento de la página.
   - **Testing en JavaScript**: Introducción a las pruebas automatizadas en JavaScript, incluyendo pruebas unitarias con herramientas como **Jest** o **Mocha**.
13x. **PWA (Progressive Web Apps)**:
   - **Progressive Web Apps**: Se introduce el concepto de **PWA**, aplicaciones web que ofrecen características avanzadas como notificaciones push, trabajo sin conexión, y funcionalidad similar a las aplicaciones nativas.
   - **Service Workers**: Uso de **service workers** para manejar el almacenamiento en caché y permitir que la aplicación web funcione sin conexión.

14. **Web Components**:
   - **Componentes reutilizables**: Se introduce el concepto de *Web Components* para crear componentes reutilizables y encapsulados en las aplicaciones web.
   - **Shadow DOM**: Uso del *Shadow DOM* para encapsular el estilo y el comportamiento de un componente web, evitando que afecte a otros elementos de la página.

15. **API's del Navegador**:
   - **Geolocalización**: Uso de la API de geolocalización para acceder a la ubicación del usuario.
   - **Local Storage y Session Storage**: Uso de las APIs de almacenamiento local y de sesión para almacenar datos en el navegador.

Esta asignatura es fundamental para adquirir las habilidades necesarias para desarrollar aplicaciones web modernas y efectivas, enfocándose en la creación de interfaces atractivas, interactivas y optimizadas para una variedad de dispositivos y condiciones de uso.
