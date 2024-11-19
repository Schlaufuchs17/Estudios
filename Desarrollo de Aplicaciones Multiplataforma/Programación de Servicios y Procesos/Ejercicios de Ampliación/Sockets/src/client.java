import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            String menu = """
                    Menú:
                    1. Consultar libro por ISBN
                    2. Consultar libro por título
                    3. Consultar libros por autor
                    4. Añadir libro
                    5. Salir
                    """;

            while (true) {
                System.out.println(menu);
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el ISBN: ");
                        String isbn = scanner.nextLine();
                        out.println("CONSULTAR_ISBN;" + isbn);
                        System.out.println("Respuesta: " + in.readLine());
                    }
                    case 2 -> {
                        System.out.print("Ingrese el título: ");
                        String titulo = scanner.nextLine();
                        out.println("CONSULTAR_TITULO;" + titulo);
                        System.out.println("Respuesta: " + in.readLine());
                    }
                    case 3 -> {
                        System.out.print("Ingrese el autor: ");
                        String autor = scanner.nextLine();
                        out.println("CONSULTAR_AUTOR;" + autor);
                        String response;
                        while (!(response = in.readLine()).equals("END")) {
                            System.out.println(response);
                        }
                    }
                    case 4 -> {
                        System.out.print("Ingrese el ISBN: ");
                        String nuevoISBN = scanner.nextLine();
                        System.out.print("Ingrese el título: ");
                        String nuevoTitulo = scanner.nextLine();
                        System.out.print("Ingrese el autor: ");
                        String nuevoAutor = scanner.nextLine();
                        System.out.print("Ingrese el precio: ");
                        double nuevoPrecio = scanner.nextDouble();
                        scanner.nextLine();
                        out.println("AÑADIR_LIBRO;" + nuevoISBN + ";" + nuevoTitulo + ";" + nuevoAutor + ";" + nuevoPrecio);
                        System.out.println("Respuesta: " + in.readLine());
                    }
                    case 5 -> {
                        out.println("SALIR");
                        System.out.println("Saliendo...");
                        return;
                    }
                    default -> System.out.println("Opción no válida");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
