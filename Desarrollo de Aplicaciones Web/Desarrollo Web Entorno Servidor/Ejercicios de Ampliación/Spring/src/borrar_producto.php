<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Borrar Producto</title>
</head>
<body>

<?php
//Obtener el ID del producto a editar desde el index.php
$producto_id = $_GET['id'];

if ($_SERVER['REQUEST_METHOD'] === 'POST') { //Conexion
    if (isset($_POST['confirmar']) && $_POST['confirmar'] === 'Si') {
        $conexion = new mysqli("localhost", "adrian", "1987", "gestion_productos");

        // Verificar la conexion
        if ($conexion->connect_error) {
            die("Error de conexión: " . $conexion->connect_error);
        }

        //Consulta sql
        $consulta = "DELETE FROM productos WHERE id=$producto_id";

        //Ejecutar sql
        if ($conexion->query($consulta) === TRUE) {
            echo "Producto eliminado";
        } else {
            echo "Error al eliminar el producto: " . $conexion->error;
        }

        $conexion->close();

        header("Location: index.php"); //Redirigir a la lista de productos
        exit();
    } else {
        echo "No se ha eliminado el producto";
    }
} else {
    // Mostrar el formulario de confirmación
    ?>
    <h1>Borrar Producto</h1>
    <p>¿Estas seguro de que deseas borrar este producto?</p>
    <form method="post" action="">
        <input type="submit" name="confirmar" value="Si">
        <input type="submit" name="confirmar" value="No">
    </form>
    <?php
}
?>

<br>
<a href="index.php">Volver a la lista de productos</a>

</body>
</html>
