package rmi_exemplu3.client.controller;

import rmi_exemplu3.library.db.Produs;
import rmi_exemplu3.library.rmi.IProdusService;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Collections;
import java.util.List;

public class ClientController {

    private IProdusService produsService;

    private ClientController() {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 4444);
            produsService = (IProdusService) registry.lookup("produsService");
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

    public void adaugaProdus(Produs produs) {
        try {
            produsService.adaugaProdus(produs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Produs> getAllProducts() {
        try {
            return produsService.getAllProducts();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public void stergeProdus(Produs produs) {
        try {
            produsService.removeProdus(produs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
