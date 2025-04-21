package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface InterfazDeServer extends Remote {
    public ArrayList<Persona> getPersonas() throws RemoteException;
    public void crearPersona(String nombre, int edad) throws RemoteException;
}
