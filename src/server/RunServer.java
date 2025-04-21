package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import common.InterfazDeServer;

public class RunServer {
    public static void main(String[] args) {
        try {
            InterfazDeServer server = new ServerImpl();
            Registry registry = LocateRegistry.createRegistry(1009);
            registry.bind("server", server);
            System.out.println("✅ Servidor arriba!! Esperando clientes...");

            // Esto mantiene el servidor activo indefinidamente
            Object lock = new Object();
            synchronized (lock) {
                lock.wait(); // Espera infinita (hasta que lo detengas manualmente)
            }

        } catch (Exception e) {
            System.err.println("❌ Excepción del Servidor: " + e.toString());
            e.printStackTrace();
            System.out.println("Servidor abajo :(");
        }
    }
}
