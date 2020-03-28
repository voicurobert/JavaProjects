package messenger.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnectionController {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    private ConnectionController() {
        try {
            socket = new Socket("localhost", 4444);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final class SingletonHolder {
        private static final ConnectionController INSTACE = new ConnectionController();
    }

    public static ConnectionController getInstance() {
        return SingletonHolder.INSTACE;
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    public String receiveMessage(){
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }
}
