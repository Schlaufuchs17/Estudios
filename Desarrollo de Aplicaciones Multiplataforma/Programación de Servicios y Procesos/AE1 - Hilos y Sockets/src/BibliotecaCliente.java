import java.io.*;
import java.net.*;
import java.util.Scanner;

public class BibliotecaCliente {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            Scanner scanner = new Scanner(System.in)
        ) {
            while (true) {
                System.out.println("\nMenú:");
                System.out.println("1. Consultar libro por ISBN");
                System.out.println("2. Consultar libro por título");
                System.out.println("3. Consultar libros por autor");
                System.out.println("4. Añadir libro");
                System.out.println("5. Salir de la aplicación");
                System.out.print("Seleccione una opción: ");
                String opcion = scanner.nextLine();
                output.writeObject(opcion);

                switch (opcion) {
                    case "1": // Consultar por ISBN
                        System.out.print("Ingrese el ISBN: ");
                        output.writeObject(scanner.nextLine());
                        System.out.println("Respuesta: " + input.readObject());
                        break;
                    case "2": // Consultar por título
                        System.out.print("Ingrese el título: ");
                        output.writeObject(scanner.nextLine());
                        System.out.println("Respuesta: " + input.readObject());
                        break;
                    case "3": // Consultar por autor
                        System.out.print("Ingrese el autor: ");
                        output.writeObject(scanner.nextLine());
                        System.out.println("Respuesta: " + input.readObject());
                        break;
                    case "4": // Añadir libro
                        System.out.print("ISBN: ");
                        String isbn = scanner.nextLine();
                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();
                        System.out.print("Precio: ");
                        double precio = Double.parseDouble(scanner.nextLine());
                        output.writeObject(new Libro(isbn, titulo, autor, precio));
                        System.out.println("Respuesta: " + input.readObject());
                        break;
                    case "5": // Salir
                        System.out.println("Saliendo...");
                        socket.close();
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
