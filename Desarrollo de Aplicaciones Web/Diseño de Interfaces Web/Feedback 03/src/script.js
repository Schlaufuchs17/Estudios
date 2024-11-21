$(document).ready(function () {
    var totalImagenes = $('.imagen').length;
    var currentIndex = 0;
  
    function mostrarImagen(index) {
      $('.imagen').removeClass('visible');
      $('.imagen').eq(index).addClass('visible');
    }
  
    mostrarImagen(currentIndex); // Mostrar la primera imagen al cargar la pagina
  
    // Boton siguiente
    $('#siguiente').click(function () {
      currentIndex = (currentIndex + 1) % totalImagenes;
      mostrarImagen(currentIndex);
    });
  
    // Boton anterior
    $('#anterior').click(function () {
      currentIndex = (currentIndex - 1 + totalImagenes) % totalImagenes;
      mostrarImagen(currentIndex);
    });
  });
  