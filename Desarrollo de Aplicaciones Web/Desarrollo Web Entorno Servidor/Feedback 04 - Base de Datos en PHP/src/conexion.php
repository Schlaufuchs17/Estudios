<?php
$host = 'localhost'; //Servidor
$dbname = 'paises'; //Nombre de la base de datos
$username = 'adrian'; //Nombre de usuario
$password = '1987'; //Contrasena

//Control de que la conexion este bien
try {
    $pdo = new PDO("mysql:host=$host;dbname=$dbname", $username, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die("Error de conexión: " . $e->getMessage());
}
?>
