<?php
$conexion = new mysqli("localhost", "adrian", "1987", "gestion_productos");

//Conexion
if ($conexion->connect_error) {
    die("Error de conexión: " . $conexion->connect_error);
}

$consulta = "SELECT * FROM productos"; //cosulta sql para obtener los productos
$resultado = $conexion->query($consulta);

//Tabla de procuctos
while ($fila = $resultado->fetch_assoc()) {
    echo "<tr>";
    echo "<td>{$fila['id']}</td>"; //id
    echo "<td>{$fila['nombre']}</td>"; //nombre
    echo "<td>{$fila['marca']}</td>"; //marca
    echo "<td>{$fila['fabricado_en']}</td>"; //fabricado
    echo "<td>{$fila['precio']}</td>"; //precio
    echo "<td><a href='editar_producto.php?id={$fila['id']}'>Editar</a> | <a href='borrar_producto.php?id={$fila['id']}'>Borrar</a></td>"; //editar - borrar
    echo "</tr>";
}
// Cerrar la conexion
$conexion->close();
?>
