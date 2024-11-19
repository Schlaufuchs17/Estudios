import java.io.*;
import java.net.*;
import java.util.*;

class Libro {
    String ISBN;
    String titulo;
    String autor;
    double precio;

    public Libro(String ISBN, String titulo, String autor, double precio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", Titulo: " + titulo + ", Autor: " + autor + ", Precio: $" + precio;
    }
}

public class Server {
    private static List<Libro> libros = new ArrayList<>();

    public static void main(String[] args) {
        // Libros preestablecidos
        libros.add(new Libro("12345", "El Quijote", "Miguel de Cervantes", 9.99));
        libros.add(new Libro("67890", "Cien Años de Soledad", "Gabriel García Márquez", 12.99));
        libros.add(new Libro("11223", "1984", "George Orwell", 15.99));
        libros.add(new Libro("44556", "Matar a un ruiseñor", "Harper Lee", 10.99));
        libros.add(new Libro("77889", "Orgullo y Prejuicio", "Jane Austen", 8.99));

        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Servidor iniciado en el puerto 12345...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado: " + clientSocket.getInetAddress());

                new Thread(() -> handleClient(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String request;
            while ((request = in.readLine()) != null) {
                String[] parts = request.split(";");
                String command = parts[0];

                switch (command) {
                    case "CONSULTAR_ISBN":
                        String isbn = parts[1];
                        Libro libroPorISBN = libros.stream()
                                .filter(libro -> libro.ISBN.equals(isbn))
                                .findFirst()
                                .orElse(null);
                        out.println(libroPorISBN != null ? libroPorISBN : "Libro no encontrado");
                        break;

                    case "CONSULTAR_TITULO":
                        String titulo = parts[1];
                        Libro libroPorTitulo = libros.stream()
                                .filter(libro -> libro.titulo.equalsIgnoreCase(titulo))
                                .findFirst()
                                .orElse(null);
                        out.println(libroPorTitulo != null ? libroPorTitulo : "Libro no encontrado");
                        break;

                    case "CONSULTAR_AUTOR":
                        String autor = parts[1];
                        List<Libro> librosPorAutor = new ArrayList<>();
                        for (Libro libro : libros) {
                            if (libro.autor.equalsIgnoreCase(autor)) {
                                librosPorAutor.add(libro);
                            }
                        }
                        if (librosPorAutor.isEmpty()) {
                            out.println("No se encontraron libros del autor.");
                        } else {
                            for (Libro libro : librosPorAutor) {
                                out.println(libro);
                            }
                        }
                        out.println("END");
                        break;

                    case "AÑADIR_LIBRO":
                        String nuevoISBN = parts[1];
                        String nuevoTitulo = parts[2];
                        String nuevoAutor = parts[3];
                        double nuevoPrecio = Double.parseDouble(parts[4]);
                        libros.add(new Libro(nuevoISBN, nuevoTitulo, nuevoAutor, nuevoPrecio));
                        out.println("Libro añadido correctamente");
                        break;

                    case "SALIR":
                        out.println("Conexión cerrada");
                        return;

                    default:
                        out.println("Comando no reconocido");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
