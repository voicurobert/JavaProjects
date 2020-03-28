package send_instance_to_server.server;

import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(4444);
            while (true) {
                new ServerThread(ss.accept()).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
