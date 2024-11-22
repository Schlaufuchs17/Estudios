document.getElementById('caja').addEventListener('keydown', function() {
    cambiarColor('blue');
});

document.getElementById('caja').addEventListener('keyup', function() {
    cambiarColor('red');
});

function cambiarColor(color) {
    document.getElementById('caja').style.backgroundColor = color;
}
