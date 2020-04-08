package lib.rmi;

import lib.db.User;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IUserService extends Remote {

    void addUser(User user) throws RemoteException;

    boolean usernameExists(String username) throws RemoteException;

    User loginUser(String username, String password) throws RemoteException;

}
