package es.edix.modelo.persistencia.interfaz;

import java.util.List;

import es.edix.modelo.entidad.Autor;

public interface DaoAutor {
	
    /*Abrir conexion: Se abre con JPA Librerias, devuelve @true si se ha conectado, 
     * si no @false*/
	public boolean abrirConexion();
	
	
     /*Cerrar conexion: Cierra la conexion de la BBDD, devuelve @true si se ha cerrado,
      * si no @false*/
    public boolean cerrarConexion();
    

    /*Añadimos la informacion en la BBDD mediante el autor y cascadeType.All @param autor,
    devuelve @true si es correcto,
    si no @false
    */
    public boolean añadir(Autor autor);
    
    
    /*Devuelve la informacion de la tabla uator @return list */
    public List<Autor> list();
}