package menus;

import dao.CocheDAO;
import models.Coche;
import java.util.List;
import java.util.Scanner;

public class MenuCoches {

    public static void gestionarCoches(Scanner scanner, CocheDAO cocheDAO) {
        while (true) {
            System.out.println("Gestión de Coches:");
            System.out.println("1. Añadir nuevo coche");
            System.out.println("2. Borrar coche por ID");
            System.out.println("3. Consultar coche por ID");
            System.out.println("4. Modificar coche por ID");
            System.out.println("5. Listar todos los coches");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    añadirNuevoCoche(scanner, cocheDAO);
                    break;
                case 2:
                    borrarCochePorId(scanner, cocheDAO);
                    break;
                case 3:
                    consultarCochePorId(scanner, cocheDAO);
                    break;
                case 4:
                    modificarCochePorId(scanner, cocheDAO);
                    break;
                case 5:
                    listarCoches(cocheDAO);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void añadirNuevoCoche(Scanner scanner, CocheDAO cocheDAO) {
        System.out.print("Ingrese la marca del coche: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del coche: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el color del coche: ");
        String color = scanner.nextLine();

        Coche coche = new Coche(0, marca, modelo, color);
        cocheDAO.insertarCoche(coche);
        System.out.println("Coche añadido correctamente.");
    }

    private static void borrarCochePorId(Scanner scanner, CocheDAO cocheDAO) {
        System.out.print("Ingrese el ID del coche a borrar: ");
        int id = scanner.nextInt();
        cocheDAO.borrarCochePorId(id);
        System.out.println("Coche borrado correctamente.");
    }

    private static void consultarCochePorId(Scanner scanner, CocheDAO cocheDAO) {
        System.out.print("Ingrese el ID del coche a consultar: ");
        int id = scanner.nextInt();
        Coche coche = cocheDAO.consultarCochePorId(id);
        if (coche != null) {
            System.out.println("Coche encontrado: " + coche);
        } else {
            System.out.println("Coche no encontrado.");
        }
    }

    private static void modificarCochePorId(Scanner scanner, CocheDAO cocheDAO) {
        System.out.print("Ingrese el ID del coche a modificar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la nueva marca del coche: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el nuevo modelo del coche: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el nuevo color del coche: ");
        String color = scanner.nextLine();

        Coche coche = new Coche(id, marca, modelo, color);
        cocheDAO.modificarCochePorId(id, coche);
        System.out.println("Coche modificado correctamente.");
    }

    private static void listarCoches(CocheDAO cocheDAO) {
        List<Coche> coches = cocheDAO.listarCoches();
        if (coches.isEmpty()) {
            System.out.println("No hay coches en la base de datos.");
        } else {
            System.out.println("Listado de coches:");
            for (Coche coche : coches) {
                System.out.println(coche);
            }
        }
    }
}
