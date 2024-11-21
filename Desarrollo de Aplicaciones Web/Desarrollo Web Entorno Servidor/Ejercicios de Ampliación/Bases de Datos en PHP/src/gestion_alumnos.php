<?php
$host = 'localhost'; //Servidor, como es local lo ponemos asi
$dbname = 'feedback04'; //Nombre de la base de datos
$user = 'adrian'; //Usuario desde el que nos conectamos
$pass = '1987';

//Conexion por PDO para que se pueda conectar a php MyAdmin
try {
    $pdo = new PDO("mysql:host=$host;dbname=$dbname", $user, $pass);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die("Error de conexión: " . $e->getMessage());
}

//Formulario del alumno que queremos modificar
if (!isset($_POST['submit']) || !isset($_POST['nombre'])) {
    ?>
    <html>
    <body>
        <form action="" method="post">
            <p>Nombre del alumno a modificar:</p>
            <input type="text" name="nombre" required>
            <input type="submit" name="submit" value="Enviar">
        </form>
    </body>
    </html>
    <?php
} else {
    //Mensaje por si el nombre que se introduce no existe
    $nombre = $_POST['nombre'];
    $stmt = $pdo->prepare("SELECT nombre FROM alumnospdo WHERE nombre = :nombre");
    $stmt->bindParam(':nombre', $nombre);
    $stmt->execute();
    $row = $stmt->fetch(PDO::FETCH_ASSOC);

    if (!$row) {
        die("El alumno con nombre '$nombre' no existe");
    }

    ?>
    <!--Formulario del nombre nuevo-->
    <html>
    <body>
        <form action="" method="post">
            <p>Introduzca el nombre del nuevo alumno:</p>
            <input type="text" name="nuevoNombre" value="<?php echo $row['nombre']; ?>" required>
            <input type="hidden" name="nombre" value="<?php echo $row['nombre']; ?>">
            <input type="submit" name="modificar" value="Modificar">
        </form>
    </body>
    <?php
}

if (isset($_POST['modificar']) && isset($_POST['nuevoNombre'])) {
    $nombre = $_POST['nombre'];
    $nuevoNombre = $_POST['nuevoNombre'];

    $stmt = $pdo->prepare("UPDATE alumnospdo SET nombre = :nuevoNombre WHERE nombre = :nombre");
    $stmt->bindParam(':nombre', $nombre);
    $stmt->bindParam(':nuevoNombre', $nuevoNombre);

    if ($stmt->execute()) {
        // Mensaje que informa de los datos que hemos cambiado
        echo "Nombre anterior: $nombre <br>";
        echo "Nombre nuevo: $nuevoNombre <br>";
        echo "Se ha actualizado correctamente";
    } else {
        //Mensaje por si escribimos algun caracter que no este contemplado o haya un problema de conexion
        echo "No se ha podido actualizar";
    }
}
?>
