<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Crear Producto</title>
</head>
<body>
    <h1>Crear Nuevo Producto</h1>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        // Procesar el formulario de creacion
        $nombre = $_POST['nombre'];
        $marca = $_POST['marca'];
        $fabricado_en = $_POST['fabricado_en'];
        $precio = $_POST['precio'];

        // Validar y almacenar en la base de datos
        if (!empty($nombre) && !empty($precio)) {
            $conexion = new mysqli("localhost", "adrian", "1987", "gestion_productos"); //conexion a la base de datos

            // Verificar la conexion
            if ($conexion->connect_error) {
                die("Error de conexion: " . $conexion->connect_error);
            }

            //sql para introducir un producto nuevo y ejecutar consulta para crearlo
            $consulta = "INSERT INTO productos (nombre, marca, fabricado_en, precio) VALUES ('$nombre', '$marca', '$fabricado_en', $precio)";
            if ($conexion->query($consulta) === TRUE) {
                echo "Producto creado";
            } else {
                echo "Error al crear el producto: " . $conexion->error;
            }

            $conexion->close();
        } else {
            echo "Faltan campos por introducir";
        }
    }
    ?>

    <!-- Formulario de creacion -->
    <form method="post" action="">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" required><br>

        <label for="marca">Marca:</label>
        <input type="text" name="marca"><br>

        <label for="fabricado_en">Fabricado en:</label>
        <input type="text" name="fabricado_en"><br>

        <label for="precio">Precio:</label>
        <input type="number" name="precio" step="0.01" required><br>

        <input type="submit" value="Crear Producto">
    </form>

    <br>
    <a href="index.php">Volver a la lista de productos</a>
</body>
</html>
