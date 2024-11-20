package Controlador;

import Vista.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {
		
	VentanaPrincipal  ventana = new VentanaPrincipal();
	
	ManejadorEventos gestor = new ManejadorEventos(ventana);

	ventana.Manejador(gestor);
	}

}
