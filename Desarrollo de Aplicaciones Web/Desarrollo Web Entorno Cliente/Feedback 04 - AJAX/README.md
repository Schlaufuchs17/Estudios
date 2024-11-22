# Feedback 04 - AJAX

El objeto de esta práctica es simular un escenario real de una página web de cualquier servidor existente en internet.

Esto es, dada una lista desplegable de datos, una vez seleccionado un dato de esta lista, se hace una petición asíncrona (AJAX) al servidor buscando los datos relacionados con el dato seleccionado por el usuario en la web. Esto se hace en segundo plano, sin interferir cualquier otra acción que esté realizando el usuario.

Esta aplicación mostrará una lista de países, y cuando el usuario seleccione uno de ellas, buscará en un fichero JSON (como si fuese una base de datos), las ciudades del país seleccionado, que se presentarán en la página web.

Como el fichero de datos JSON es un recurso local, el programa que realizará el usuario (.html) se encontrará en el mismo directorio que el archivo de datos .json.

El archivo .html será ejecutado desde un servidor web (Web server Chrome sino tenemos otro) ya que se accederá al fichero de datos, listadoPaises.json que es un recurso local de nuestro equipo, por esto se tiene que ejecutar desde el servidor por temas de seguridad.
Téngase en cuenta la estructura de un fichero JSON (pares de clave/valor).