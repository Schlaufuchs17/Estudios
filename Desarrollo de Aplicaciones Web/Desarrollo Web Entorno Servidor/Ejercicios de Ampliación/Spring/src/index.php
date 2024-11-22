<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Lista de Productos</title>
</head>
<body>
    <h1>Lista de Productos</h1>

    <?php
    //Conexion a la base de datos
    $conexion = new mysqli("localhost", "adrian", "1987", "gestion_productos");

    //Verificar la conexion
    if ($conexion->connect_error) {
        die("Error de conexion: " . $conexion->connect_error);
    }

    // Consulta sql para obtener los productos que hemos creado en la base de datos
    $consulta = "SELECT * FROM productos";
    $resultado = $conexion->query($consulta);

    //Mostrar la lista de productos, que tendria que ser lo primero que aparece
    if ($resultado->num_rows > 0) {
        echo "<ul>";
        while ($producto = $resultado->fetch_assoc()) {
            echo "<li>{$producto['nombre']} ({$producto['marca']}) - Precio: {$producto['precio']} "; //nombre, marca y precio
            echo "<a href='editar_producto.php?id={$producto['id']}'>Editar</a> "; //editar
            echo "<a href='borrar_producto.php?id={$producto['id']}'>Borrar</a></li>"; //borrar
        }
        echo "</ul>";
    } else {
        echo "<p>No hay productos disponibles</p>";
    }

    // Cerrar la conexion
    $conexion->close();
    ?>

    <!--Crear producto-->
    <p>
        <a href="crear_producto.php">Crear nuevo producto</a>
    </p>
</body>
</html>
