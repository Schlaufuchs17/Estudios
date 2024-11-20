package es.edix.modelo.persistencia.interfaz;

import java.util.List;


import es.edix.modelo.entidad.Libreria;

public interface DaoLibreria {

	 /*Abrir conexion: Se abre con JPA Librerias, devuelve @true si se ha conectado, 
     * si no @false*/
	public boolean abrirConexion();
	
	/*Cerrar conexion: Cierra la conexion de la BBDD, devuelve @true si se ha cerrado,
      * si no @false*/
    public boolean cerrarConexion();
    
	//Devuelve la informacion de la tabla libreria
    public List<Libreria> list();

}