package rmi_exemplu1.server;

import rmi_exemplu1.library.rmi.IMyService;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements IMyService {

    public Server() throws RemoteException{
        Registry registry = LocateRegistry.createRegistry(4444);
        registry.rebind("server", this);
    }

    public static void main(String[] args) {
        try {
            new Server();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String reverseString(String string) throws RemoteException {
        return new StringBuilder(string).reverse().toString();
    }
}
