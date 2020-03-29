package rmi_exemplu2_file_manager.lib;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMyService extends Remote {
    String list(String path) throws RemoteException;
    public void createFile(String fileLocation) throws RemoteException;
}
