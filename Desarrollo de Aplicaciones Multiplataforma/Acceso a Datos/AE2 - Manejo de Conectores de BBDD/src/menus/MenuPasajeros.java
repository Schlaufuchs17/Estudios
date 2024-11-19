package menus;

import dao.PasajeroDAO;
import dao.CocheDAO;
import models.Pasajero;
import java.util.List;
import java.util.Scanner;

public class MenuPasajeros {

    public static void gestionarPasajeros(Scanner scanner, PasajeroDAO pasajeroDAO, CocheDAO cocheDAO) {
        while (true) {
            System.out.println("Gestión de Pasajeros:");
            System.out.println("1. Añadir nuevo pasajero");
            System.out.println("2. Borrar pasajero por ID");
            System.out.println("3. Consultar pasajero por ID");
            System.out.println("4. Listar todos los pasajeros");
            System.out.println("5. Añadir pasajero a un coche");
            System.out.println("6. Eliminar pasajero de un coche");
            System.out.println("7. Listar todos los pasajeros de un coche");
            System.out.println("8. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    añadirNuevoPasajero(scanner, pasajeroDAO);
                    break;
                case 2:
                    borrarPasajeroPorId(scanner, pasajeroDAO);
                    break;
                case 3:
                    consultarPasajeroPorId(scanner, pasajeroDAO);
                    break;
                case 4:
                    listarPasajeros(pasajeroDAO);
                    break;
                case 5:
                    añadirPasajeroACoche(scanner, pasajeroDAO, cocheDAO);
                    break;
                case 6:
                    eliminarPasajeroDeCoche(scanner, pasajeroDAO, cocheDAO);
                    break;
                case 7:
                    listarPasajerosDeCoche(scanner, cocheDAO, pasajeroDAO);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void añadirNuevoPasajero(Scanner scanner, PasajeroDAO pasajeroDAO) {
        System.out.print("Ingrese el nombre del pasajero: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del pasajero: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el peso del pasajero: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        Pasajero pasajero = new Pasajero(0, nombre, edad, peso);
        pasajeroDAO.insertarPasajero(pasajero);
        System.out.println("Pasajero añadido correctamente.");
    }

    private static void borrarPasajeroPorId(Scanner scanner, PasajeroDAO pasajeroDAO) {
        System.out.print("Ingrese el ID del pasajero a borrar: ");
        int id = scanner.nextInt();
        pasajeroDAO.borrarPasajeroPorId(id);
        System.out.println("Pasajero borrado correctamente.");
    }

    private static void consultarPasajeroPorId(Scanner scanner, PasajeroDAO pasajeroDAO) {
        System.out.print("Ingrese el ID del pasajero a consultar: ");
        int id = scanner.nextInt();
        Pasajero pasajero = pasajeroDAO.consultarPasajeroPorId(id);
        if (pasajero != null) {
            System.out.println("Pasajero encontrado: " + pasajero);
        } else {
            System.out.println("Pasajero no encontrado.");
        }
    }

    private static void listarPasajeros(PasajeroDAO pasajeroDAO) {
        List<Pasajero> pasajeros = pasajeroDAO.listarPasajeros();
        if (pasajeros.isEmpty()) {
            System.out.println("No hay pasajeros en la base de datos.");
        } else {
            System.out.println("Listado de pasajeros:");
            for (Pasajero pasajero : pasajeros) {
                System.out.println(pasajero);
            }
        }
    }

    private static void añadirPasajeroACoche(Scanner scanner, PasajeroDAO pasajeroDAO, CocheDAO cocheDAO) {
        System.out.print("Ingrese el ID del pasajero: ");
        int pasajeroId = scanner.nextInt();
        System.out.print("Ingrese el ID del coche: ");
        int cocheId = scanner.nextInt();

        System.out.println("Pasajero añadido al coche correctamente.");
    }

    private static void eliminarPasajeroDeCoche(Scanner scanner, PasajeroDAO pasajeroDAO, CocheDAO cocheDAO) {
        System.out.print("Ingrese el ID del pasajero: ");
        int pasajeroId = scanner.nextInt();
        System.out.print("Ingrese el ID del coche: ");
        int cocheId = scanner.nextInt();

        System.out.println("Pasajero eliminado del coche correctamente.");
    }

    private static void listarPasajerosDeCoche(Scanner scanner, CocheDAO cocheDAO, PasajeroDAO pasajeroDAO) {
        System.out.print("Ingrese el ID del coche: ");
        int cocheId = scanner.nextInt();

        System.out.println("Listado de pasajeros del coche:");
    }
}
