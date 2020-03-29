package rmi_exemplu2_file_manager.client.controller;



import rmi_exemplu2_file_manager.lib.IMyService;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientController {

    private IMyService service;

    private ClientController() {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 4444);
            service = (IMyService) registry.lookup("fileService");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final class SingletonHolder {
        private static final ClientController SINGLETON = new ClientController();
    }

    public static ClientController getInstance() {
        return SingletonHolder.SINGLETON;
    }

    public String list(String pathLocation) {
        try {
            return service.list(pathLocation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public void createFile(String fileLocation) {
        try {
            service.createFile(fileLocation);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
