# ES Desarrollo Web en Entorno Servidor

**Centro de Estudios:**  Universidad Alfonso X el Sabio.

**Profesor:** Francisco Javier Segovia.
#
La asignatura de **Desarrollo Web en Entorno Servidor** se enfoca en aprender a desarrollar aplicaciones web dinámicas que interactúan con bases de datos y son ejecutadas en un servidor. Este curso está orientado a comprender cómo funcionan las aplicaciones del lado del servidor (*back-end*) y cómo se conectan con el lado del cliente (*front-end*) para ofrecer servicios interactivos a los usuarios:

1. **Introducción al Desarrollo Web en Entorno Servidor**:

   - **Cliente-servidor**: Se explica el modelo de arquitectura cliente-servidor, donde el cliente (navegador) realiza solicitudes HTTP al servidor, que procesa esas solicitudes y devuelve respuestas, generalmente en formato HTML, JSON o XML.
   - **Lenguajes del lado del servidor**: Se introducen los lenguajes que permiten la programación del lado del servidor, como **PHP**, **Python** (con frameworks como *Django* o *Flask*), **Node.js**, **Java** (con *Spring*), **Ruby** (con *Ruby on Rails*), etc.
   - **Diferencias entre front-end y back-end**: Se diferencia entre la parte del desarrollo web que se ejecuta en el cliente (front-end) y la que se ejecuta en el servidor (back-end).

2. **HTTP y Comunicación Cliente-Servidor**:
   - **Protocolo HTTP/HTTPS**: Se estudian los fundamentos del protocolo HTTP, cómo se estructuran las peticiones y respuestas, los métodos más utilizados (*GET*, *POST*, *PUT*, *DELETE*), y el uso de HTTPS para garantizar la seguridad en las comunicaciones.
   - **Cabeceras HTTP**: Aprendizaje sobre las cabeceras HTTP, tanto en las peticiones (*User-Agent*, *Content-Type*, etc.) como en las respuestas (Status, Content-Length, etc.).
   - **Sesiones y cookies**: Gestión del estado en aplicaciones web mediante el uso de cookies y sesiones, para mantener la información entre diferentes solicitudes.

3. **Lenguajes de Programación en Entorno Servidor**:
   - **PHP**: Introducción a PHP, uno de los lenguajes más usados para desarrollo web del lado del servidor. Se aprenden conceptos como:
     - Sintaxis básica de PHP.
     - Variables, estructuras de control y funciones.
     - Manejo de formularios y envío de datos.
     - Gestión de sesiones y cookies en PHP.
   - **Node.js**: Se estudia Node.js, un entorno de ejecución de JavaScript en el servidor que permite manejar aplicaciones en tiempo real. Se aprende:
     - Conceptos básicos de **JavaScript** en el servidor.
     - Manejo de módulos y paquetes con *npm*.
     - Uso de *Express.js* para crear servidores y manejar rutas.
     - Gestión de bases de datos y APIs en *Node.js*.
   - **Python**: Uso de frameworks como *Django* o *Flask* para desarrollar aplicaciones web robustas, con énfasis en la estructura *MVC* (Modelo-Vista-Controlador) y la facilidad para integrar bases de datos.

4. **Manejo de Bases de Datos**:
   - **Conexión con bases de datos**: Se enseña cómo conectar una aplicación web con una base de datos, utilizando lenguajes del lado del servidor como PHP, Node.js, o Python.
   - **SQL**: Se profundiza en el lenguaje SQL para manipular bases de datos relacionales. Se aprenden sentencias *SELECT*, *INSERT*, *UPDATE* y *DELETE*, así como consultas más avanzadas con *JOIN*, *GROUP BY*, y subconsultas.
   - **ORM (Object-Relational Mapping)**: Uso de ORMs** como *Eloquent* en PHP (Laravel), *Sequelize* en Node.js o *Django ORM* en **Python**, para interactuar con bases de datos de manera más eficiente y evitar el uso directo de consultas SQL.

5. **Arquitectura de Aplicaciones Web**:
   - **Arquitectura MVC (Modelo-Vista-Controlador)**: Se explica cómo estructurar una aplicación web usando el patrón de arquitectura *MVC*, separando la lógica de negocio (modelo), la interfaz de usuario (vista), y el control de las solicitudes/respuestas (controlador).
   - **Routing**: Se enseña cómo manejar las rutas en las aplicaciones web, es decir, cómo definir las URL que el servidor puede procesar y cómo asignarles controladores específicos.
   - **RESTful APIs**: Creación de APIs RESTful para que las aplicaciones puedan comunicar datos entre sí o con el cliente. Se enseñan los principios REST y cómo diseñar endpoints eficientes.

6. **Autenticación y Autorización**:
   - **Autenticación de usuarios**: Se estudian métodos para autenticar usuarios en aplicaciones web, como el uso de formularios de inicio de sesión, sistemas de registro y la gestión de contraseñas de forma segura (*hashing* y *salting*).
   - **OAuth y JWT (JSON Web Tokens)**: Implementación de sistemas de autenticación basados en *OAuth* o *JWT*, que permiten a los usuarios autenticarse usando servicios externos (Google, Facebook, etc.) o mediante *tokens* de autenticación.
   - **Roles y permisos**: Se enseña a implementar sistemas de autorización, donde a los usuarios se les otorgan diferentes permisos o roles para acceder a distintas partes de la aplicación.

7. **Gestión de Archivos y Subida de Datos**:
   - **Manejo de archivos**: Se aprende cómo permitir a los usuarios subir archivos (imágenes, documentos, etc.) y cómo manejarlos en el servidor, tanto para almacenarlos en el sistema de archivos como en bases de datos.
   - **Validación de datos**: Antes de almacenar los datos enviados por los usuarios (a través de formularios o subida de archivos), se enseñan técnicas para validar la información en el servidor, asegurándose de que sea correcta y segura.

8. **Seguridad en Aplicaciones Web**:
   - **Prevención de ataques**: Se estudian las principales amenazas de seguridad en aplicaciones web, como:
     - **SQL Injection**: Ataques donde el usuario malicioso intenta ejecutar código SQL no autorizado en la base de datos.
     - **Cross-Site Scripting (XSS)**: Inyección de scripts maliciosos en el navegador de los usuarios.
     - **Cross-Site Request Forgery (CSRF)**: Ataques donde se obliga a un usuario a realizar una acción en una aplicación sin su consentimiento.
   - **Buenas prácticas de seguridad**: Uso de prácticas como el cifrado de datos sensibles, la validación de entradas de usuario, el uso de HTTPS, y la correcta gestión de sesiones.

9. **Despliegue de Aplicaciones Web**:
   - **Servidores web**: Se enseña cómo configurar servidores web como Apache o Nginx para desplegar aplicaciones del lado del servidor.
   - **Hosting y dominios**: Cómo subir una aplicación web a un servicio de *hosting* o a la nube (como AWS, Heroku o DigitalOcean) y asociarla con un dominio.
   - **Automatización del despliegue**: Uso de herramientas de automatización para gestionar el proceso de despliegue de manera eficiente, como *CI/CD* (Continuous Integration/Continuous Deployment).

10. **APIs y Consumo de Servicios Externos**:
   - **Consumo de APIs**: Se enseña cómo consumir servicios web externos (como APIs de terceros) desde una aplicación del lado del servidor. Esto puede incluir servicios como Google Maps, APIs de redes sociales, servicios de pago (como *Stripe* o *PayPal*), y más.
   - **Integración de microservicios**: En aplicaciones grandes, se puede enseñar a trabajar con arquitecturas basadas en microservicios, donde distintas partes de la aplicación interactúan entre sí mediante APIs independientes.

11. **Desarrollo de Aplicaciones en Tiempo Real**:
   - **WebSockets**: Para crear aplicaciones que requieren una comunicación en tiempo real (como chats, juegos multijugador o aplicaciones de *trading*), se enseña el uso de WebSockets para mantener una conexión constante entre el cliente y el servidor.
   - **Node.js y Socket.io**: Se estudian herramientas como Socket.io en Node.js para facilitar la creación de aplicaciones que manejan eventos en tiempo real.

12. **Optimización de Aplicaciones Web**:
   - **Optimización del rendimiento**: Técnicas para mejorar el rendimiento de las aplicaciones web, como el uso de caché en el servidor, optimización de consultas SQL, y uso eficiente de los recursos del servidor.
   - **Escalabilidad**: Cómo hacer que una aplicación sea escalable, de manera que pueda manejar un mayor número de usuarios o transacciones sin perder rendimiento. Esto incluye técnicas como el balanceo de carga, la replicación de bases de datos, y el uso de servicios en la nube.

13. **Testing y Depuración de Aplicaciones Web**:
   - **Pruebas automatizadas**: Se enseña a escribir pruebas unitarias y de integración para asegurar que la lógica del servidor funciona correctamente. Herramientas como *JUnit* para **Java**, *Mocha* para **Node.js** o *PHPUnit* para **PHP** son utilizadas.
   - **Depuración**: Técnicas para depurar aplicaciones en el servidor, como el uso de herramientas de eelogs y monitoreo para detectar errores y cuellos de botella.

14. **Desarrollo de Aplicaciones Web con Frameworks**:
   - **PHP con Laravel**: Uso de Laravel, un popular framework para PHP, que facilita el desarrollo rápido de aplicaciones con una arquitectura clara y modular.
   - **Node.js con Express.js**: Creación de aplicaciones en Node.js utilizando Express.js para gestionar rutas, middleware, y otros aspectos esenciales del servidor.
   - **Python con Django/Flask**: Desarrollo de aplicaciones web con Django (un framework más robusto y estructurado) o Flask (más ligero y flexible), ambos en Python**.

Esta asignatura proporciona las bases para desarrollar aplicaciones web completas, que no solo proporcionan una interfaz atractiva, sino que también gestionan datos, interacciones, seguridad, y escalabilidad en un servidor.

