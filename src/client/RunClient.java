package client;

import java.io.IOException;
import java.rmi.NotBoundException;

public class RunClient {
	public static void main(String[] args) throws NotBoundException, IOException {
		Client client = new Client();
		client.startClient();

		System.out.println("Cliente arriba!! ");
		System.out.println("¡Hola! ¿Qué desea consultar?");
		System.out.println("(1) Para ver el listado de personas, presione 1.");
		System.out.println("(2) Para ingresar una nueva persona, presione 2.");
		
		while(true) {	
			System.out.println("Ingrese la opción: ");
			char bufferInput = (char) System.in.read();
			
			if (bufferInput == '1') {
				client.getPersonas();
			} else if (bufferInput == '2') {
				client.crearPersona();
			}
			// Limpiar el buffer
            System.in.skip(System.in.available());
            
		}
	}
}