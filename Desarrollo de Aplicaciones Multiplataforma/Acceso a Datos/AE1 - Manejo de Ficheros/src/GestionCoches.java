import java.io.*;
import java.util.*;

public class GestionCoches {
    private static final String FICHERO_DATOS = "coches.dat";
    private static final String FICHERO_TEXTO = "coches.txt";
    private static ArrayList<Coche> coches = new ArrayList<>();

    public static void main(String[] args) {
        cargarCochesDesdeFichero();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> agregarCoche(scanner);
                case 2 -> borrarCochePorId(scanner);
                case 3 -> consultarCochePorId(scanner);
                case 4 -> listarCoches();
                case 5 -> guardarCochesEnFichero();
                case 6 -> exportarCochesATexto();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nGestión del Almacén de Coches");
        System.out.println("1. Añadir nuevo coche");
        System.out.println("2. Borrar coche por id");
        System.out.println("3. Consulta coche por id");
        System.out.println("4. Listado de coches");
        System.out.println("5. Guardar y terminar el programa");
        System.out.println("6. Exportar coches a archivo de texto");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void cargarCochesDesdeFichero() {
        File file = new File(FICHERO_DATOS);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                coches = (ArrayList<Coche>) ois.readObject();
                System.out.println("Datos cargados correctamente.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al cargar datos: " + e.getMessage());
            }
        }
    }

    private static void agregarCoche(Scanner scanner) {
        System.out.print("Introduce el id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Introduce la matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Introduce la marca: ");
        String marca = scanner.nextLine();

        System.out.print("Introduce el modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Introduce el color: ");
        String color = scanner.nextLine();

        if (coches.stream().anyMatch(c -> c.getId() == id || c.getMatricula().equalsIgnoreCase(matricula))) {
            System.out.println("Error: No se permite duplicar el id o la matrícula.");
            return;
        }

        coches.add(new Coche(id, matricula, marca, modelo, color));
        System.out.println("Coche añadido correctamente.");
    }

    private static void borrarCochePorId(Scanner scanner) {
        System.out.print("Introduce el id del coche a borrar: ");
        int id = scanner.nextInt();

        boolean eliminado = coches.removeIf(c -> c.getId() == id);

        if (eliminado) {
            System.out.println("Coche eliminado correctamente.");
        } else {
            System.out.println("Coche con id " + id + " no encontrado.");
        }
    }

    private static void consultarCochePorId(Scanner scanner) {
        System.out.print("Introduce el id del coche a consultar: ");
        int id = scanner.nextInt();

        coches.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .ifPresentOrElse(
                        c -> System.out.println("Detalles del coche: " + c),
                        () -> System.out.println("Coche con id " + id + " no encontrado.")
                );
    }

    private static void listarCoches() {
        if (coches.isEmpty()) {
            System.out.println("No hay coches en el almacén.");
        } else {
            System.out.println("Listado de coches:");
            coches.forEach(System.out::println);
        }
    }

    private static void guardarCochesEnFichero() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO_DATOS))) {
            oos.writeObject(coches);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }

    private static void exportarCochesATexto() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FICHERO_TEXTO))) {
            for (Coche coche : coches) {
                writer.println(coche);
            }
            System.out.println("Datos exportados correctamente al archivo de texto.");
        } catch (IOException e) {
            System.out.println("Error al exportar datos: " + e.getMessage());
        }
    }
}
