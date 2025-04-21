package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import common.Persona;
import common.InterfazDeServer;

public class ServerImpl extends UnicastRemoteObject implements InterfazDeServer {

    private static final long serialVersionUID = 1L;

    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public ServerImpl() throws RemoteException {
        super();
        personas.add(new Persona("Juan", 20));
        personas.add(new Persona("Lucía", 25));
    }

    @Override
    public void crearPersona(String nombre, int edad) throws RemoteException {
        personas.add(new Persona(nombre, edad));
    }

    @Override
    public ArrayList<Persona> getPersonas() throws RemoteException {
        return personas;
    }
}
