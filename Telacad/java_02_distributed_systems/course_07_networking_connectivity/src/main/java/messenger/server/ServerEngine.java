package messenger.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEngine {
    private ServerSocket ss;

    private ServerEngine() {
        try {
            ss = new ServerSocket(4444);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final class ServerEngineHolder{
        private static final ServerEngine INSTANCE = new ServerEngine();
    }

    public static ServerEngine getInstance() {
        return ServerEngineHolder.INSTANCE;
    }

    public ServerThread connectedClient() throws Exception {
        Socket socket = ss.accept();

        ServerThread serverThread = new ServerThread(socket);
        serverThread.start();
        return serverThread;
    }
}
