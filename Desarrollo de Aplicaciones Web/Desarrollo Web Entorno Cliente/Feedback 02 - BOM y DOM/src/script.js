document.getElementById("botonpar").addEventListener("click", imagenesPares);
document.getElementById("botonimpar").addEventListener("click", imagenesImpares);

function imagenesPares() {
    var images = document.querySelectorAll("#imageTable img");
    images.forEach(function(img, index) {
        if ((index + 1) % 2 === 0) {
            img.parentNode.style.display = "table-cell"; // Mostrar la celda
        } else {
            img.parentNode.style.display = "none"; // Ocultar la celda
        }
    });
}

function imagenesImpares() {
    var images = document.querySelectorAll("#imageTable img");
    images.forEach(function(img, index) {
        if ((index + 1) % 2 !== 0) {
            img.parentNode.style.display = "table-cell"; // Mostrar la celda
        } else {
            img.parentNode.style.display = "none"; // Ocultar la celda
        }
    });
}
