package rmi_exemplu1.library.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMyService extends Remote {
    public String reverseString(String dirLocation) throws RemoteException;
}
