package rmi_exemplu2_file_manager.server;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(4444);
            registry.rebind("fileService", new FileService());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
