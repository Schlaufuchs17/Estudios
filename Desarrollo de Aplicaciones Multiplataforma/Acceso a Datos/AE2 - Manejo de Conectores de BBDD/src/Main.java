package main;

import database.DatabaseConnection;
import dao.CocheDAOImpl;
import dao.PasajeroDAOImpl;
import menus.MenuCoches;
import menus.MenuPasajeros;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var conexion = DatabaseConnection.getConnection();
        var cocheDAO = new CocheDAOImpl(conexion);
        var pasajeroDAO = new PasajeroDAOImpl(conexion);

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Gestión de Coches");
            System.out.println("2. Gestión de Pasajeros");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> MenuCoches.gestionarCoches(scanner, cocheDAO);
                case 2 -> MenuPasajeros.gestionarPasajeros(scanner, pasajeroDAO, cocheDAO);
                case 3 -> {
                    System.out.println("Saliendo del programa...");
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
