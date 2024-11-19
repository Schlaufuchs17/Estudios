import javax.crypto.Cipher;
import java.security.*;
import java.util.Base64;
import java.util.Scanner;

public class EncriptadorAsimetrico {

    private static KeyPair keyPair;
    private static String encryptedPhrase = null;
    private static String encryptedCar = null;

    public static void main(String[] args) throws Exception {
        keyPair = generateKeyPair();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Encriptar frase");
            System.out.println("2. Mostrar frase encriptada");
            System.out.println("3. Desencriptar frase");
            System.out.println("4. Encriptar coche");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la frase a encriptar: ");
                    String frase = scanner.nextLine();
                    encryptedPhrase = encrypt(frase, keyPair.getPublic());
                    System.out.println("Frase encriptada exitosamente.");
                    break;
                case 2:
                    if (encryptedPhrase != null) {
                        System.out.println("Frase encriptada: " + encryptedPhrase);
                    } else {
                        System.out.println("No hay ninguna frase encriptada.");
                    }
                    break;
                case 3:
                    if (encryptedPhrase != null) {
                        String decryptedPhrase = decrypt(encryptedPhrase, keyPair.getPrivate());
                        System.out.println("Frase desencriptada: " + decryptedPhrase);
                    } else {
                        System.out.println("No hay ninguna frase encriptada.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese la matrícula del coche: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Ingrese la marca del coche: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo del coche: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese el precio del coche: ");
                    String precio = scanner.nextLine();

                    String carData = String.format("Matrícula: %s, Marca: %s, Modelo: %s, Precio: %s", matricula, marca, modelo, precio);
                    encryptedCar = encrypt(carData, keyPair.getPublic());
                    System.out.println("Coche encriptado exitosamente.");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        return keyGen.generateKeyPair();
    }

    private static String encrypt(String data, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static String decrypt(String encryptedData, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes);
    }
}
