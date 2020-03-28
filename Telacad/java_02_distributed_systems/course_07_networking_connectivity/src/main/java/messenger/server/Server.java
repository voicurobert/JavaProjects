package messenger.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    public static void main(String[] args) {
        try {
            while (true) {
                ServerThread serverThread = ServerEngine.getInstance().connectedClient();
                ClientiContainer.addClient(serverThread);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
