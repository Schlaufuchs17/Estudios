<?php

// Conexión a la base de datos
$servername = "localhost"; //Como es local el servidor es localhost
$username = "adrian"; //Nombre de usuario con privilwgios
$password = "1987"; //Contraseña
$dbname = "feedback4"; //Base de datos que he reutilizado del ejercicio anterior

$conn = new mysqli($servername, $username, $password, $dbname);

//Veriricamos que se hace la conexion
if ($conn->connect_error) {
    die("Conexión fallida: " . $conn->connect_error);
}

//Funcion requerida para guardar la contraseña
function hashpassword($password) 
{ 
    return password_hash($password, PASSWORD_BCRYPT); 
}

//Funcion requerida para verificar que las contraseñas coinciden
function coincidenpasswords($password, $passwordBD) 
{ 
    return password_verify($password, $passwordBD); 
}

//Formulario de registro
if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST["registro"])) {
    $usuario = $_POST["usuario"];
    $password = hashpassword($_POST["password"]);

    $sql = "INSERT INTO usuarios (usuario, password) VALUES ('$usuario', '$password')";
    
    if ($conn->query($sql) === TRUE) {
        echo "Registro realizado con exito";
    } else {
        echo "Error al registrar: " . $conn->error;
    }
}

//Formulario de inicio de sesion
if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST["login"])) {
    $usuario = $_POST["usuario"];
    $password = $_POST["password"];

    $sql = "SELECT password FROM usuarios WHERE usuario = '$usuario'";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();
        if (coincidenpasswords($password, $row["password"])) {
            echo "Inicio de sesion correcto";
        } else {
            echo "Contraseña incorrecta";
        }
    } else {
        echo "Usuario no encontrado";
    }
}

$conn->close();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Login y Registro</title>
</head>
<body>

<!-- Formulario de registro -->
<h2>Registro</h2>
<form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
    Usuario: <input type="text" name="usuario" required><br>
    Contraseña: <input type="password" name="password" required><br>
    <input type="submit" name="registro" value="Registrar">
</form>

<!-- Formulario de inicio de sesion -->
<h2>Iniciar Sesion</h2>
<form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
    Usuario: <input type="text" name="usuario" required><br>
    Contraseña: <input type="password" name="password" required><br>
    <input type="submit" name="login" value="Iniciar Sesion">
</form>

</body>
</html>
