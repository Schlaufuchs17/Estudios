package es.edix.modelo.persistencia;

import es.edix.modelo.entidad.*;
import es.edix.modelo.persistencia.interfaz.DaoBaseDatos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class DaoBaseDatosMySql implements DaoBaseDatos {
    

    public void drop() {
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPALibrerias");
            EntityManager em = factory.createEntityManager();
            EntityTransaction et = em.getTransaction();
            et.begin();         
            em.createNativeQuery("DROP database Librerias_jpa").executeUpdate();           
            et.commit();
            em.close();
            factory.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getLocalizedMessage());
        }
    }

	public long comprobarTablas() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPALibrerias");
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		long nRows = (long) em.createQuery("SELECT COUNT(a.id) FROM Autor a").getSingleResult();
		et.commit();
		em.close();
		factory.close();
		return nRows;
	}

	public void rellenarTablas() {
		DaoAutorMySql daoAutor = new DaoAutorMySql();
		
		Direccion direccion1 = new Direccion("España", "Barcelona", "Av. Diagonal, 662", "08034"); //Minotauro
		Direccion direccion2 = new Direccion("España", "Madrid", "Cl. Juan Ignacio Luca de Tena, 17", "28027"); //Grupo Planeta
		Direccion direccion3 = new Direccion("España", "Madrid", "Cl. Preciados, 1", "28013"); //Casa del libro
		Direccion direccion4 = new Direccion("España", "Madrid", "Cl. Guzman el Bueno, 46", "28015"); //Estudio en Escarlata

		Editorial editorial1 = new Editorial("Ediciones Minotauro", direccion1);
		Editorial editorial2 = new Editorial("Grupo Planeta", direccion2);

		Libreria libreria1 = new Libreria("Casa del Libro", "Kratos", direccion3);
		Libreria libreria2 = new Libreria("Estudio en Escarlata", "Solid Snake", direccion4);

		Autor autor1 = new Autor("JRR", "Tolkien", "1892.01.03");// libro 1, libro 4, libro 7
		Autor autor2 = new Autor("Stephen", "King", "1947.09.21");// libro 2, libro 5 , libro 8
		Autor autor3 = new Autor("Robert Anthony", "Salvatore", "1959.01.20");// libro 3, libro 6

		Libro libro1 = new Libro("El Señor de los Anillos", 20.50);
		libro1.setAutor(autor1);
		autor1.setLibro(libro1);
		libro1.setEditorial(editorial1);
		editorial1.setLibro(libro1);

		Libro libro2 = new Libro("Misery", 19.95);
		libro2.setAutor(autor2);
		autor2.setLibro(libro2);
		libro2.setEditorial(editorial2);
		editorial2.setLibro(libro2);

		Libro libro3 = new Libro("Los Mil Orcos", 30.50);
		libro3.setAutor(autor3);
		autor3.setLibro(libro3);
		libro3.setEditorial(editorial1);
		editorial1.setLibro(libro3);

		Libro libro4 = new Libro("El Hobbit", 20.50);
		libro4.setAutor(autor1);
		autor1.setLibro(libro4);
		libro4.setEditorial(editorial2);
		editorial2.setLibro(libro4);

		Libro libro5 = new Libro("Cementerio de Animales", 19.95);
		libro5.setAutor(autor2);
		libro5.setEditorial(editorial1);
		autor2.setLibro(libro5);
		editorial1.setLibro(libro5);

		Libro libro6 = new Libro("La Promesa del Rey Brujo", 30.50);
		libro6.setAutor(autor3);
		libro6.setEditorial(editorial2);
		autor3.setLibro(libro6);
		editorial2.setLibro(libro6);

		Libro libro7 = new Libro("El Silmarilion", 20.50);
		libro7.setAutor(autor1);
		libro7.setEditorial(editorial1);
		autor1.setLibro(libro7);
		editorial1.setLibro(libro7);
		
		Libro libro8 = new Libro("El Resplandor", 19.95);
		libro8.setAutor(autor2);
		libro8.setEditorial(editorial2);
		autor2.setLibro(libro8);
		editorial2.setLibro(libro8);

		List<Libreria> librerias1 = new ArrayList<>();
		List<Libreria> librerias2 = new ArrayList<>();
		List<Libro> libros1 = new ArrayList<>();
		List<Libro> libros2 = new ArrayList<>();

		librerias1.add(libreria1);
		librerias1.add(libreria2);
		libros1.add(libro1);
		libros1.add(libro2);
		libros1.add(libro3);
		libros1.add(libro4);
		
		librerias2.add(libreria1);
		libros2.add(libro5);
		libros2.add(libro6);
		libros2.add(libro7);
		libros2.add(libro8);

		libro1.setLibrerias(librerias1);
		libro2.setLibrerias(librerias1);
		libro3.setLibrerias(librerias1);
		libro4.setLibrerias(librerias1);
		libreria1.setLibros(libros1);
		libreria2.setLibros(libros1);


		libro5.setLibrerias(librerias2);
		libro6.setLibrerias(librerias2);
		libro7.setLibrerias(librerias2);
		libro8.setLibrerias(librerias2);
		libreria1.setLibros(libros2);

		
		try {
			if (daoAutor.añadir(autor1) || daoAutor.añadir(autor2) || daoAutor.añadir(autor3)) {
				System.out.println("BBDD creada con exito");
			}
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getLocalizedMessage());
		}

	}

    
    

}