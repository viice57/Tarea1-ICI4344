package client;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.Scanner;

public class RunClient {
	public static void main(String[] args) throws NotBoundException, IOException {
		Scanner scanner = new Scanner(System.in);
		Client client = new Client();
		client.startClient();

		System.out.println("Cliente arriba!! ");

		while (true) {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("(1) Ver listado de personas");
			System.out.println("(2) Ingresar nueva persona");
			System.out.println("(3) Salir");
			System.out.print("Ingrese opción: ");
			String opcion = scanner.nextLine();

			if (opcion.equals("1")) {
				client.mostrarPersonas();
			} else if (opcion.equals("2")) {
				System.out.print("Ingrese nombre: ");
				String nombre = scanner.nextLine();

				System.out.print("Ingrese edad: ");
				int edad = Integer.parseInt(scanner.nextLine());

				client.crearPersona(nombre, edad);
				System.out.println("✅ Persona creada con éxito.");
			} else if (opcion.equals("3")) {
				System.out.println("👋 Hasta luego!");
				break;
			} else {
				System.out.println("❌ Opción no válida. Intente de nuevo.");
			}
		}

		scanner.close();
	}
}
