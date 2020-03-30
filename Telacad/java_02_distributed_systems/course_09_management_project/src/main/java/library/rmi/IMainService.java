package library.rmi;

import library.db.Clasa;
import library.db.Curs;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IMainService extends Remote {

    public List<Clasa> getClase() throws RemoteException;

    public void adaugaCurs(Curs curs) throws RemoteException;

    public List<Curs> getCursuri() throws RemoteException;

    public void removeClasa(Clasa clasa) throws RemoteException;
}
