package client.controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RegistryController {

    private Registry registry;

    private RegistryController(){
        try {
            registry = LocateRegistry.getRegistry("localhost", 4444);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    private static final class SingletonHolder {
        private static final RegistryController SINGLETON = new RegistryController();
    }

    public static RegistryController getInstance() {
        return SingletonHolder.SINGLETON;
    }

    public Registry getRegistry() {
        return registry;
    }
}
