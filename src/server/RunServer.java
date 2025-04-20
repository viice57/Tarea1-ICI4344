package server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import common.InterfazDeServer;
import common.Persona;

public class RunServer {
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		try {
			InterfazDeServer server = new ServerImpl();
			Registry registry = LocateRegistry.createRegistry(1009);
			registry.bind("server", server);
			System.out.println("Servidor arriba!!");
		} catch (Exception e) {
			System.err.println("Excepción del Servidor: " + e.toString());
			e.printStackTrace();
		}
		System.out.println("Servidor abajo :(");
	}
}
