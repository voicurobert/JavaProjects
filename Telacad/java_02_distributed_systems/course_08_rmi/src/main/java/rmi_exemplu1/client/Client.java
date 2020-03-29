package rmi_exemplu1.client;

import rmi_exemplu1.library.rmi.IMyService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 4444);
            IMyService server = (IMyService) registry.lookup("server");
            String result = server.reverseString("Hello World!");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
