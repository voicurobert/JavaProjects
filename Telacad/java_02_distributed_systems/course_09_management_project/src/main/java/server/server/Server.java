package server.server;

import server.service.MainService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(4444);
            registry.rebind("mainService", new MainService());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
