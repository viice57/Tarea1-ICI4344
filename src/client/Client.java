package client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

import common.InterfazDeServer;
import common.Persona;

public class Client {
	private InterfazDeServer server;

	public Client() {}

	// Conecta con el servidor
	public void startClient() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry("localhost", 1009);
		server = (InterfazDeServer) registry.lookup("server");
	}

	// Mostrar lista de personas
	public void mostrarPersonas() throws RemoteException {
		ArrayList<Persona> personas = server.getPersonas();

		System.out.println("NOMBRE\tEDAD");
		for (Persona persona : personas) {
			System.out.println(persona.getNombre() + "\t" + persona.getEdad());
		}
	}

	// Crear persona (usando nombre y edad)
	public void crearPersona(String nombre, int edad) throws RemoteException {
		server.crearPersona(nombre, edad);
	}
}
