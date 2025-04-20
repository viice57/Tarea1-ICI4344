package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface InterfazDeServer extends Remote {
	public ArrayList<Persona> getPersonas() throws RemoteException;
	public Persona Persona(int id, String nombre, int edad) throws RemoteException;
	public void agregarPersona() throws RemoteException;
}