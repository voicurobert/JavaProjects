package messenger.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private static List<ServerThread> clienti = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(4444);

            while (true) {
                Socket socket = serverSocket.accept();
                synchronized (Server.class) {
                    ServerThread serverThread = new ServerThread(socket);
                    serverThread.start();
                    clienti.add(serverThread);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized void sendMessageToAll(String message) {
        clienti.forEach(serverThread -> serverThread.sendMessage(message));
    }
}
