# ES Acceso a Datos

**Centro de Estudios:**  Universidad Internacional de la Rioja.
**Profesor:** Félix de Pablo.

#
En la asignatura de **Acceso a Datos**, el objetivo principal es aprender cómo manejar, almacenar, y recuperar datos en diferentes tipos de bases de datos, así como interactuar con diferentes formatos de almacenamiento:

1. **Modelos de Bases de Datos**:
   - **Bases de datos relacionales**: Se estudia cómo almacenar y organizar datos en tablas (relaciones), donde cada tabla tiene filas (tuplas) y columnas (atributos). Se exploran conceptos clave como *llaves primarias* y *llaves foráneas*.
   - **Bases de datos no relacionales** (NoSQL): También se introducen bases de datos NoSQL, que no utilizan el modelo relacional. Ejemplos son *MongoDB* (basada en documentos), *Redis* (basada en clave-valor), y *Cassandra* (orientada a columnas).
   
2. **Lenguaje SQL (Structured Query Language)**: Se aprende a utilizar SQL para interactuar con bases de datos relacionales. Esto incluye:
     - **Consultas básicas**: `SELECT`, `INSERT`, `UPDATE`, `DELETE`.
     - **Consultas avanzadas**: `JOIN` para combinar tablas, *subconsultas*, y *funciones agregadas* (como `COUNT`, `SUM`, `AVG`).
     - **Creación de tablas:** (`CREATE TABLE`), *modificación* de la estructura (`ALTER TABLE`) y *eliminación* (`DROP TABLE`).
   - Se exploran las distintas formas de optimizar consultas y diseñar bases de datos eficientes.

3. **Lenguaje NoSQL**: Para bases de datos NoSQL, se aprenden los comandos específicos de cada base, como *queries* en MongoDB utilizando JSON, o cómo estructurar datos en otros sistemas NoSQL.
   - Se cubren casos donde las bases NoSQL son más adecuadas que las relacionales, como para manejar grandes volúmenes de datos no estructurados.

4. **Conexión a bases de datos desde aplicaciones**:
   - Se aprende a conectar aplicaciones con bases de datos utilizando diferentes lenguajes de programación, como **Java**, **Python**, o **C#**. Usarás tecnologías y librerías como:
     - **JDBC** (Java Database Connectivity) para conectar aplicaciones Java a bases de datos.
     - **ODBC** (Open Database Connectivity) o **ADO.NET** para aplicaciones en C#.
     - **ORM (Object-Relational Mapping)**: Herramientas como *Hibernate* (Java) o *Entity Framework* (C#), que permiten mapear objetos de la aplicación a tablas de la base de datos.

5. **Transacciones y Control de concurrencia**:
   - Se introduce el concepto de transacciones, que permiten ejecutar un conjunto de operaciones de manera que, si una falla, todo el conjunto se deshace. Las transacciones cumplen con las propiedades *ACID* (Atomicidad, Consistencia, Aislamiento, Durabilidad).
   - Además, se estudian mecanismos de control de concurrencia, que aseguran que múltiples transacciones o usuarios puedan acceder a los mismos datos sin generar conflictos. Esto incluye:
     - Bloqueos (locks) para prevenir acceso simultáneo a los mismos datos.
     - Niveles de aislamiento para definir qué tan separadas están las transacciones concurrentes.

6. **Almacenamiento y Recuperación de Datos en Ficheros**:
   - No siempre se usa una base de datos para almacenar datos. También se enseña cómo gestionar archivos de texto, binarios, **XML**, **JSON**, etc., para almacenar y recuperar datos.
   - Aprenderás a utilizar los sistemas de ficheros de los diferentes lenguajes de programación (como `File` en Java o `FileStream` en C#) para leer y escribir en estos formatos.
   - También se cubren técnicas de serialización y deserialización, donde los objetos de la aplicación se convierten en datos almacenables y viceversa.

7. **Modelado de datos**:
   - Se profundiza en el diseño y modelado de bases de datos utilizando diagramas entidad-relación (ER para representar entidades y sus relaciones.
   - Se aprende sobre normalización, que es el proceso de estructurar una base de datos para reducir la redundancia y evitar problemas de actualización.

8. **Seguridad en Bases de Datos**:
   - Se cubren aspectos de seguridad en el acceso a bases de datos, como:
     - **Control de acceso**: Definir roles y permisos para los usuarios.
     - **Cifrado de datos**: Asegurar que los datos estén cifrados tanto en reposo (almacenados) como en tránsito (cuando se transfieren entre sistemas).
     - **Autenticación** y **autorización** para asegurar que solo los usuarios correctos puedan acceder a los datos.
   - Prevención de *SQL Injection*: Una técnica de ataque donde los usuarios maliciosos intentan manipular consultas SQL.

9. **Procedimientos almacenados y Triggers**:
   - Se aprende a escribir procedimientos almacenados (Stored Procedures), que son bloques de código SQL almacenados en la base de datos y que pueden ser ejecutados desde la aplicación.
   - Triggers son acciones que se ejecutan automáticamente en la base de datos cuando ocurre un evento específico (como una inserción o actualización en una tabla).

10. **Optimización de consultas y bases de datos**:
   - Aprenderás técnicas para mejorar el rendimiento de las consultas y de la base de datos, como:
     - **Índices**: Estructuras de datos que mejoran la velocidad de recuperación de datos.
     - **Desnormalización** para mejorar el rendimiento en algunos casos sacrificando redundancia.
     - Técnicas de particionado de tablas para distribuir los datos y mejorar la eficiencia.

11. **Bases de datos distribuidas**:
   - Se introduce el concepto de bases de datos distribuidas, donde los datos están repartidos en diferentes servidores. Esto implica aprender cómo sincronizar y coordinar los datos entre varias ubicaciones, además de gestionar la replicación (copias de datos en múltiples servidores).

12. **Servicios de bases de datos en la nube**:
   - Con la creciente popularidad del almacenamiento en la nube, también se cubre cómo interactuar con bases de datos en servicios como *Amazon RDS*, *Google Cloud SQL* o *Azure SQL Database*.

13. **Big Data y bases de datos masivas**:
   - En proyectos de Big Data, se maneja grandes volúmenes de datos. Aprenderás sobre tecnologías y bases de datos que están diseñadas para manejar estos volúmenes, como **Hadoop** o **Apache Cassandra**, y cómo integrarlas con las aplicaciones.

La asignatura de Acceso a Datos se centra en cómo almacenar, gestionar, y recuperar datos de manera eficiente en diferentes tipos de bases de datos, ya sean relacionales o NoSQL. Además, se abordan temas de seguridad, optimización, y cómo conectar las aplicaciones a bases de datos para construir sistemas robustos y escalables.
