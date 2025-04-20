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

	public void startClient() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry("localhost", 5000);
		server = (InterfazDeServer) registry.lookup("server");
	}
	
	public ArrayList<Persona> getPersonas() throws RemoteException {
		ArrayList<Persona> personas = server.getPersonas();
		
		System.out.println("ID NOMBRE EDAD");
		
		for (int i = 0; i < personas.size(); i++) {
			Persona persona = personas.get(i);
			String nombre;
			int id, edad;
			
			id = persona.getId();
			nombre = persona.getNombre();
			edad = persona.getEdad();
			
			System.out.println(id + " " + nombre + " " + edad);
		}
		
		return null;
	}
	
	public void crearPersona() throws RemoteException {
		server.crearPersona();
	}
}