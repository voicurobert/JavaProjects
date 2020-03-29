package rmi_exemplu3.library.rmi;

import rmi_exemplu3.library.db.Produs;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IProdusService extends Remote {

    public void adaugaProdus(Produs produs) throws RemoteException;

    public List<Produs> getAllProducts() throws RemoteException;

    public void removeProdus(Produs produs) throws RemoteException;

}
