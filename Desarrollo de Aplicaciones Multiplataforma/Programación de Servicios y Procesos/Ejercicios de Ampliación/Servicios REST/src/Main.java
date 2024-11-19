import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteREST clienteREST = new ClienteREST();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Listar videojuegos");
            System.out.println("2. Agregar videojuego");
            System.out.println("3. Eliminar videojuego por ID");
            System.out.println("4. Actualizar videojuego por ID");
            System.out.println("5. Obtener videojuego por ID");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    try {
                        System.out.println(clienteREST.listarTodos());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
