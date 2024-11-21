<?php
include 'conexion.php';

//Funcion para obtener los paises
function getPaises() {
    global $pdo;
    $query = $pdo->prepare("SELECT * FROM paises");
    $query->execute();
    return $query->fetchAll(PDO::FETCH_ASSOC);
}

//Mostrar la lista de paises en el navegador
$paises = getPaises();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Feedback 4</title>
</head>
<body>
    <!--Lista de paises creados-->
    <h2>Lista de Paises</h2>
    <?php if (!empty($paises)): ?>
        <ul>
            <?php foreach ($paises as $pais): ?>
                <li><?php echo isset($pais['pais_id']) ? $pais['pais_id'] . '. ' : ''; ?>
                <?php echo isset($pais['nombre_pais']) ? $pais['nombre_pais'] : 'Nombre no disponible'; ?></li>
            <?php endforeach; ?>
        </ul>
    <?php else: ?> <!--Si no hay paises mostrara que no hay ninguno-->
        <p>No hay paises aun</p>
    <?php endif; ?>

    <!--Añadir pais-->
    <h2>Agregar Nuevo Pais</h2>
    <form action="agregar.php" method="post">
        <label for="pais">Nombre del País:</label>
        <input type="text" name="pais" required>
        <input type="submit" value="Agregar">
    </form>
</body>
</html>
