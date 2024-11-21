<?php
include 'conexion.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST') { //Mandar por post
    $nombrePais = $_POST['pais']; //Almacena el nombre

    $query = $pdo->prepare("INSERT INTO paises (nombre_pais) VALUES (:nombre_pais)");
    $query->bindParam(':nombre_pais', $nombrePais); //Vincula la posicion del pais
    $query->execute();

    header("Location: index.php"); //Vuelve a index
    exit();
}
?>
