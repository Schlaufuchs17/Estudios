<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombre = $_POST["nombre"];
    $apellidos = $_POST["apellidos"];
    $telefono = $_POST["telefono"];
    $fecha_nacimiento = $_POST["fecha_nacimiento"];
    $email = $_POST["email"];
    $direccion = $_POST["direccion"];

    echo "<h2>Los datos introducidos para el registro son:</h2>";
    echo "<strong>Nombre:</strong> " . htmlspecialchars($nombre) . "<br>";
    echo "<strong>Apellidos:</strong> " . htmlspecialchars($apellidos) . "<br>";
    echo "<strong>Telefono:</strong> " . htmlspecialchars($telefono) . "<br>";
    echo "<strong>Fecha de Nacimiento:</strong> " . htmlspecialchars($fecha_nacimiento) . "<br>";
    echo "<strong>Email:</strong> " . htmlspecialchars($email) . "<br>";
    echo "<strong>Direccion:</strong> " . htmlspecialchars($direccion) . "<br>";
}
?>
