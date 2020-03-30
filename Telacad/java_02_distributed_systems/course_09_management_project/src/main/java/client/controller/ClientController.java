package client.controller;

import library.db.Clasa;
import library.db.Curs;
import library.rmi.IMainService;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Collections;
import java.util.List;

public class ClientController {

    private IMainService mainService;

    private ClientController() {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 4444);
            mainService = (IMainService) registry.lookup("mainService");
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

    public List<Clasa> getClase() {
        try {
            return mainService.getClase();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public void addCurs(Curs curs) {
        try {
            mainService.adaugaCurs(curs);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public List<Curs> getCursuri() {
        try {
            return mainService.getCursuri();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public void removeClasa(Clasa clasa) {
        try {
            mainService.removeClasa(clasa);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
