package rmi_exemplu3.server;

import rmi_exemplu3.server.service.ProdusService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(4444);
            registry.bind("produsService", new ProdusService());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
