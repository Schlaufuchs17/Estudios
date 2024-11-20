package es.edix.modelo.persistencia.interfaz;


public interface DaoBaseDatos {


	 //Borra la BBDD de librerias jpa
	public void drop();  
	
	 //Comprueba el autor para saber si hay informacion
	public long comprobarTablas();
	
	//Añadimos la informacion a traves del autor
	public void rellenarTablas();
    
}