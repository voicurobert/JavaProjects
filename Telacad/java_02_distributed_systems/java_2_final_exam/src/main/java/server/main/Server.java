package server.main;

import server.services.CarRentalService;
import server.services.CarService;
import server.services.UserService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(4444);
            registry.rebind("userService", new UserService());
            registry.rebind("carRentalService", new CarRentalService());
            registry.rebind("carService", new CarService());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
