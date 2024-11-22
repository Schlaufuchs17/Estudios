document.addEventListener("DOMContentLoaded", function() {
    var seleccionarPais = document.getElementById("seleccionarPais");
    var ciudadesList = document.getElementById("ciudades");
    var listadoPaises;

    fetch("listadoPaises.json")
        .then(response => response.json())
        .then(data => {
            listadoPaises = data;
            llenarseleccionarPaises(Object.keys(listadoPaises));
        })
        .catch(error => console.error('Error al cargar el archivo JSON:', error));

    seleccionarPais.addEventListener("change", function() {
        var paisSeleccionado = this.value;
        mostrarCiudades(listadoPaises[paisSeleccionado]);
    });

    function llenarseleccionarPaises(paises) {
        paises.forEach(function(pais) {
            var option = document.createElement("option");
            option.value = pais;
            option.textContent = pais;
            seleccionarPais.appendChild(option);
        });
    }

    function mostrarCiudades(ciudades) {
        ciudadesList.innerHTML = "";
        ciudades.forEach(function(ciudad) {
            var li = document.createElement("li");
            li.textContent = ciudad;
            ciudadesList.appendChild(li);
        });
    }
});
