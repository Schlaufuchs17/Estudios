package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Cliente {

    private static final String BASE_URL = "http://localhost:8080/videojuegos";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ObjectMapper objectMapper = new ObjectMapper();
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Dar de alta un videojuego");
            System.out.println("2. Dar de baja un videojuego por ID");
            System.out.println("3. Modificar un videojuego por ID");
            System.out.println("4. Obtener un videojuego por ID");
            System.out.println("5. Listar todos los videojuegos");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Dar de alta un videojuego
                    System.out.print("ID: ");
                    int idAlta = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombreAlta = scanner.nextLine();
                    System.out.print("Compañía: ");
                    String companiaAlta = scanner.nextLine();
                    System.out.print("Nota: ");
                    float notaAlta = scanner.nextFloat();
                    scanner.nextLine();

                    Videojuego nuevoVideojuego = new Videojuego(idAlta, nombreAlta, companiaAlta, notaAlta);
                    hacerPost(nuevoVideojuego, objectMapper);
                    break;

                case 2:
                    // Dar de baja un videojuego por ID
                    System.out.print("ID del videojuego a eliminar: ");
                    int idBaja = scanner.nextInt();
                    scanner.nextLine();
                    hacerDelete(idBaja);
                    break;

                case 3:
                    // Modificar un videojuego por ID
                    System.out.print("ID: ");
                    int idModificacion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo Nombre: ");
                    String nombreModificacion = scanner.nextLine();
                    System.out.print("Nueva Compañía: ");
                    String companiaModificacion = scanner.nextLine();
                    System.out.print("Nueva Nota: ");
                    float notaModificacion = scanner.nextFloat();
                    scanner.nextLine();

                    Videojuego videojuegoModificado = new Videojuego(idModificacion, nombreModificacion, companiaModificacion, notaModificacion);
                    hacerPut(idModificacion, videojuegoModificado, objectMapper);
                    break;

                case 4:
                    // Obtener un videojuego por ID
                    System.out.print("ID del videojuego a obtener: ");
                    int idObtener = scanner.nextInt();
                    scanner.nextLine();
                    hacerGet(idObtener);
                    break;

                case 5:
                    // Listar todos los videojuegos
                    hacerGet();
                    break;

                case 6:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    private static void hacerGet() {
        try {
            URL url = new URL(BASE_URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();

            System.out.println("Lista de Videojuegos: " + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void hacerGet(int id) {
        try {
            URL url = new URL(BASE_URL + "/" + id);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();

            System.out.println("Videojuego: " + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void hacerPost(Videojuego videojuego, ObjectMapper objectMapper) {
        try {
            String json = objectMapper.writeValueAsString(videojuego);
            URL url = new URL(BASE_URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            con.getOutputStream().write(json.getBytes("utf-8"));

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();

            System.out.println("Respuesta del servidor: " + content);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void hacerPut(int id, Videojuego videojuego, ObjectMapper objectMapper) {
        try {
            String json = objectMapper.writeValueAsString(videojuego);
            URL url = new URL(BASE_URL + "/" + id);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("PUT");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            con.getOutputStream().write(json.getBytes("utf-8"));

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();

            System.out.println("Respuesta del servidor: " + content);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void hacerDelete(int id) {
        try {
            URL url = new URL(BASE_URL + "/" + id);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("DELETE");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();

            System.out.println("Respuesta del servidor: " + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
