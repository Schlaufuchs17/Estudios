<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Editar Producto</title>
</head>
<body>
    <h1>Editar Producto</h1>

    <?php
    //Obtener el ID del producto a editar desde el index.php
    $producto_id = $_GET['id'];

    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        //Formulario de editar
        $nombre = $_POST['nombre'];
        $marca = $_POST['marca'];
        $fabricado_en = $_POST['fabricado_en'];
        $precio = $_POST['precio'];

        //Acceso a la base de datos
        if (!empty($nombre) && !empty($precio)) {
            $conexion = new mysqli("localhost", "adrian", "1987", "gestion_productos"); //Conexion

            // Verificar la conexion
            if ($conexion->connect_error) {
                die("Error de conexión: " . $conexion->connect_error);
            }

            //Consulta sql
            $consulta = "UPDATE productos SET nombre='$nombre', marca='$marca', fabricado_en='$fabricado_en', precio=$precio WHERE id=$producto_id";
            if ($conexion->query($consulta) === TRUE) {
                echo "Producto actualizado";
            } else {
                echo "Error al actualizar el producto: " . $conexion->error;
            }
            $conexion->close();
        } else {
            echo "Faltan campos por introducir";
        }
    }

    //Recoger datos de la base de datos
    $conexion = new mysqli("localhost", "adrian", "1987", "gestion_productos");
    $consulta = "SELECT * FROM productos WHERE id=$producto_id";
    $resultado = $conexion->query($consulta);
    $producto = $resultado->fetch_assoc();
    $conexion->close();
    ?>

    <!--Formulario de edicion-->
    <form method="post" action="">

        <!--Nombre-->
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" value="<?php echo $producto['nombre']; ?>" required><br>

        <!--Marca-->
        <label for="marca">Marca:</label>
        <input type="text" name="marca" value="<?php echo $producto['marca']; ?>"><br>

        <!--Fabricado en-->
        <label for="fabricado_en">Fabricado en:</label>
        <input type="text" name="fabricado_en" value="<?php echo $producto['fabricado_en']; ?>"><br>

        <!--Precio-->
        <label for="precio">Precio:</label>
        <input type="number" name="precio" step="0.01" value="<?php echo $producto['precio']; ?>" required><br>

        <!--Boton actualizar-->
        <input type="submit" value="Actualizar Producto">
    </form>

    <br>
    <a href="index.php">Volver a la lista de productos</a>
</body>
</html>
