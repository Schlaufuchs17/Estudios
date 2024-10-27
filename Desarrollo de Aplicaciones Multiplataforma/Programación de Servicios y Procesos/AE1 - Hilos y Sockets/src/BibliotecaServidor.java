import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BibliotecaServidor {
    private static final int PORT = 12345;
    private static List<Libro> libros = new ArrayList<>();
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        // Inicialización de libros predefinidos
        libros.add(new Libro("111", "Java Programming", "Autor A", 29.99));
        libros.add(new Libro("222", "Network Fundamentals", "Autor B", 35.50));
        libros.add(new Libro("333", "Data Structures", "Autor C", 40.00));
        libros.add(new Libro("444", "Operating Systems", "Autor D", 45.00));
        libros.add(new Libro("555", "Algorithms", "Autor A", 39.50));

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Servidor de biblioteca iniciado en el puerto " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado.");
                new ClientHandler(clientSocket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream())
            ) {
                while (true) {
                    String opcion = (String) input.readObject();
                    switch (opcion) {
                        case "1": // Consultar por ISBN
                            String isbn = (String) input.readObject();
                            Libro libroPorIsbn = buscarLibroPorIsbn(isbn);
                            output.writeObject(libroPorIsbn != null ? libroPorIsbn : "Libro no encontrado.");
                            break;
                        case "2": // Consultar por título
                            String titulo = (String) input.readObject();
                            Libro libroPorTitulo = buscarLibroPorTitulo(titulo);
                            output.writeObject(libroPorTitulo != null ? libroPorTitulo : "Libro no encontrado.");
                            break;
                        case "3": // Consultar por autor
                            String autor = (String) input.readObject();
                            List<Libro> librosPorAutor = buscarLibrosPorAutor(autor);
                            output.writeObject(librosPorAutor.isEmpty() ? "No se encontraron libros." : librosPorAutor);
                            break;
                        case "4": // Añadir libro
                            Libro nuevoLibro = (Libro) input.readObject();
                            lock.lock();
                            try {
                                libros.add(nuevoLibro);
                                output.writeObject("Libro añadido correctamente.");
                            } finally {
                                lock.unlock();
                            }
                            break;
                        case "5": // Salir
                            socket.close();
                            return;
                        default:
                            output.writeObject("Opción no válida.");
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        private Libro buscarLibroPorIsbn(String isbn) {
            return libros.stream().filter(libro -> libro.getIsbn().equalsIgnoreCase(isbn)).findFirst().orElse(null);
        }

        private Libro buscarLibroPorTitulo(String titulo) {
            return libros.stream().filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);
        }

        private List<Libro> buscarLibrosPorAutor(String autor) {
            List<Libro> librosDelAutor = new ArrayList<>();
            for (Libro libro : libros) {
                if (libro.getAutor().equalsIgnoreCase(autor)) {
                    librosDelAutor.add(libro);
                }
            }
            return librosDelAutor;
        }
    }
}
