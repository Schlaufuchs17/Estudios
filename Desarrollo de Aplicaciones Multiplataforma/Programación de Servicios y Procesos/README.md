# 🇪🇸 Programación de Servicios y Procesos
**Centro de estudios:** Universidad Internacional de La Rioja.

**Profesor:** Felix de Pablo Lobo.

#
En el módulo de Programación de Servicios y Procesos se aprenderá cómo desarrollar aplicaciones que funcionen en un contexto de red, gestionen múltiples procesos y ofrezcan servicios accesibles a través de Internet o una red local. Este módulo cubre varios temas clave:

1. **Programación de Servicios Web**
   - **REST y SOAP**: Se aprenderá a cómo crear servicios web utilizando APIs RESTful o SOAP, y cómo estos permiten a aplicaciones distintas comunicarse entre sí de forma estructurada.
   - **HTTP y Endpoints**: Estructurar y exponer *endpoints* que representan las diferentes funcionalidades de tu aplicación. Estos endpoints permiten a otras aplicaciones realizar acciones (GET, POST, PUT, DELETE) a través de HTTP.
   - **Formatos de Datos (JSON, XML)**: Uso de formatos de datos como JSON y XML para enviar y recibir información.

2. **Programación de Procesos**
   - **Procesos y Hilos (Threads)**: Se aprenderá cómo funcionan los procesos y los hilos dentro de una aplicación. Los procesos permiten ejecutar diferentes partes de una aplicación de manera independiente, mientras que los hilos permiten ejecutar subtareas dentro de un proceso.
   - **Sincronización y Concurrencia**: Técnicas para coordinar la ejecución de múltiples hilos o procesos, asegurando que puedan acceder a recursos compartidos sin conflictos. Aquí se aprenderán conceptos como *bloqueos (locks)* y *semáforos* para evitar condiciones de carrera y mantener la integridad de los datos.
   - **Procesamiento Asíncrono**: Se aprenderá a cómo implementar tareas que se ejecutan en segundo plano o en paralelo, de manera que la aplicación principal no tenga que esperar a que terminen. Esto es útil para tareas como el procesamiento de datos, las operaciones de red o el acceso a bases de datos.

3. **Gestión y Comunicación entre Procesos**
   - **Sockets y Redes**: Establecer comunicación entre procesos en una misma máquina o en diferentes máquinas a través de sockets (generalmente TCP o UDP). Los sockets permiten que diferentes programas o servicios intercambien información en tiempo real.
   - **RPC (Remote Procedure Call)**: Métodos para ejecutar funciones de un programa en otra máquina como si estuvieran en la misma. RPC facilita la comunicación entre programas distribuidos.
   - **Comunicación Inter-Procesos (IPC)**: Incluye técnicas para que los procesos se comuniquen, ya sea a través de *colas de mensajes*, *tuberías (pipes)*, o *compartiendo memoria*.

4. **Servicios de Sistema y Daemons**
   - **Daemons y Servicios de Fondo**: Un daemon es un programa que corre en segundo plano y gestiona tareas que deben estar disponibles todo el tiempo (por ejemplo, un servidor web). Se aprende a escribir daemons y servicios de fondo que se ejecutan sin necesidad de intervención del usuario.
   - **Inicio y Gestión de Servicios**: Iniciar, detener y monitorear estos servicios en sistemas operativos como Linux o Windows. Esto incluye el uso de herramientas como `systemd` en Linux para gestionar procesos de fondo.

5. **Seguridad y Control de Acceso**
   - **Autenticación y Autorización**: Es importante asegurar que solo los usuarios o aplicaciones autorizadas puedan acceder a los servicios, por lo que verás métodos de autenticación (como tokens JWT, claves API) y control de permisos.
   - **Cifrado de Datos**: Cómo implementar el cifrado para proteger la información transmitida entre servicios, garantizando que sea segura y privada.

6. **Despliegue y Gestión de Servicios en la Nube**
   - **Contenedores y Virtualización**: Cómo usar tecnologías de contenedores (como *Docker*) para empaquetar servicios y facilitar su despliegue en diferentes entornos.
   - **Orquestación de Contenedores (Kubernetes)**: También se suelen introducir conceptos básicos de Kubernetes, una herramienta para administrar múltiples contenedores en un entorno distribuido.
   - **CI/CD (Integración y Despliegue Continuo)**: Técnicas para automatizar el despliegue de servicios y asegurar que los cambios en el código se implementen de forma rápida y controlada.

Este módulo proporciona habilidades necesarias para crear aplicaciones distribuidas, como sistemas de microservicios, servidores de aplicaciones, y servicios web accesibles para otras aplicaciones o usuarios finales.
