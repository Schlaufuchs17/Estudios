var articulo;
var precio;
var unidades;
var articulosCarrito;
var precioCarrito;
var formaPago;
var tTarjeta;
var nTarjeta;
var cvv;
var importe;
var checkbox;
var total = 0;
var preciototal = 0;

function inicializar(){
    articulo = document.formulario.nombreArticulo;
    articulo.focus();
    precio = document.formulario.precioArticulo;
    articulosCarrito = document.formulario.articulosCarro;
    precioCarrito = document.formulario.precioCarro;
    unidades = document.formulario.unidades;
    formaPago = document.formulario.formaPago;
    tTarjeta = document.formulario.tTarjeta;
    nTarjeta = document.formulario.nTarjeta;
    cvv = document.formulario.cvv;
    importe = document.formulario.importe;
    checkbox = document.formulario.condicionesCompra;
    botonImprimir = document.formulario.botonImprimir;

    document.getElementById("faltaArtculo").style.display='none';
    document.getElementById("faltaPrecio").style.display='none';
    document.getElementById("incorrecto").style.display='none';
    document.getElementById("tarjeta").style.display='none';
    document.getElementById("efectivo").style.display='none';
 }
function anadirCarrito(){
    if(articulo.value.length >0 && isNaN(articulo.value)){
        if(precio.value.length >0){
            if(isFinite(precio.value)){
                carrito();
                alert("Añadiendo al carrito"); /*Adrian C: Ya nos coge la ñ sin problema aparente*/
            }else{
                document.getElementById("incorrecto").style.display='block';
                document.getElementById("faltaPrecio").style.display='none';
                document.getElementById("faltaArtculo").style.display='none';
                precio.focus();
            }
        }else{
            document.getElementById("faltaPrecio").style.display='block';
            document.getElementById("incorrecto").style.display='none';
            document.getElementById("faltaArtculo").style.display='none';
            precio.focus();
        }
    }else{
        document.getElementById("faltaArtculo").style.display='block';
        articulo.focus();
    }
}
function carrito(){

    articulosCarrito.value = articulosCarrito.value.concat(', ',articulo.value);
    totalCarrito();
}
function totalCarrito(){ /*Adrian C: Arreglao', ya suma bien!*/
   total= Number.parseFloat (precio.value)+Number.parseFloat (unidades.value);
   preciototal += Number.parseFloat(total);
   precioCarrito.value = preciototal.toFixed(2);
    resetCarrito();
}
function resetCarrito(){
    articulo.focus();
    articulo.value = "";
    precio.value="";
    unidades.value=1;

    document.getElementById("faltaArtculo").style.display='none';
    document.getElementById("faltaPrecio").style.display='none';
    document.getElementById("incorrecto").style.display='none';
}
function pagar(){
    if(formaPago.value == "tarjeta"){
        document.getElementById("tarjeta").style.display='block';
        tarjetaCredito();
    }else{
        document.getElementById("tarjeta").style.display='none';
    }
    if(formaPago.value == "efectivo"){
        document.getElementById("efectivo").style.display='block';
        dineroEfectivo();
    }else{
        document.getElementById("efectivo").style.display='none';
    }
    if(formaPago.value == "seleccione"){
        botonImprimir.disabled = true; 
    }
}
function tarjetaCredito(){
    if(tTarjeta.value.length >0){
        tTarjeta.style.border ="thin solid green";
        if(nTarjeta.value.length>0){
            if(isFinite(nTarjeta.value) ){
                nTarjeta.style.border ="thin solid green";
                if(isFinite(cvv.value) ){
                    if(parseInt(cvv.value)>0 && parseInt(cvv.value)<=9999){
                        cvv.style.border ="thin solid green";
                        
                    }else{
                        cvv.style.border ="thin solid red";
                    }
                }else{
                    cvv.style.border ="thin solid red";
                }
            }else{
                nTarjeta.style.border ="thin solid red";
            }
        }else{
            nTarjeta.style.border ="thin solid red";
        }
    }else{
        tTarjeta.style.border ="thin solid red";
    }
}
function dineroEfectivo(){
    if(importe.value == precioCarrito.value){
        importe.style.border ="thin solid green";
        
    }else{
       importe.style.border ="thin solid red";
    }
}
function check(){
    if(checkbox = true && formaPago.value == "tarjeta" ){
            if(tTarjeta.value.length >0){
                if(nTarjeta.value.length>0){
                    if(isFinite(cvv.value) ){
                        if(parseInt(cvv.value)>0 && parseInt(cvv.value)<=9999){
                            botonImprimir.disabled = false; 
                            document.formulario.botonImprimir.addEventListener('click',imprimir);
                        }else{
                            alert("Este campo es obligatotio")
                            botonImprimir.disabled = true; 
                        }
                    }else{
                        alert("Este campo es obligatotio")
                        botonImprimir.disabled = true; 
                    }
                }else{
                    alert("Este campo es obligatotio")
                    botonImprimir.disabled = true; 
                }
            }else{
                alert("Este campo es obligatotio")
                botonImprimir.disabled = true; 
            }
    }
    else if(checkbox.cheked = true && formaPago.value == "efectivo"){
        if(importe.value == precioCarrito.value){
            botonImprimir.disabled = false; 
            document.formulario.botonImprimir.addEventListener('click',imprimir);
        }else{
            alert("El dinero no coincide con el precio de la compra")
            botonImprimir.disabled = true; 
        }
    }
    else if(checkbox.cheked = true && formaPago.value=="seleccione"){
        checkbox.cheked = false;
        botonImprimir.disabled = true; 
        alert("Seleccione una forma de pago");
    }
}
function imprimir(){
    if(formaPago.value == "tarjeta"){
        alert("Los articulos de mi carito son "+ articulosCarrito.value + "\n y el precio total es de: "+precioCarrito.value+ "\n Forma de pago: Tarjeta");
    }
    else if(formaPago.value == "efectivo"){
        alert("Los articulos de mi carito son "+ articulosCarrito.value + "\n y el precio total es de: "+precioCarrito.value+ "\n Forma de pago: Efectivo");
    }

}
function reset(){

    articulo.focus();
    articulo.value = "";
    precio.value="";
    unidades.value=1;

    precioCarrito.value="";
    articulosCarrito.value="";
    formaPago.value = "seleccione";

    tTarjeta.value ="";
    nTarjeta.value ="";
    cvv.value ="",

    importe.value="";
    checkbox.cheked = false;
    botonImprimir.disabled = true; 

    document.getElementById("faltaArtculo").style.display='none';
    document.getElementById("faltaPrecio").style.display='none';
    document.getElementById("incorrecto").style.display='none';
    document.getElementById("tarjeta").style.display='none';
    document.getElementById("efectivo").style.display='none';
}
function configurarEventos(){
    document.formulario.botonCarrito.addEventListener('click', anadirCarrito);
    document.formulario.formaPago.addEventListener('click',pagar);
    document.formulario.condicionesCompra.addEventListener('click',check);
    document.formulario.botonReset.addEventListener('click',reset);
    document.formulario.importe.addEventListener('blur',dineroEfectivo);
    document.formulario.tTarjeta.addEventListener('blur',tarjetaCredito);
    document.formulario.nTarjeta.addEventListener('blur',tarjetaCredito);
    document.formulario.cvv.addEventListener('blur',tarjetaCredito);
}
 window.onload =function(){
     inicializar();
     configurarEventos();    
 }