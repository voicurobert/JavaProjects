package send_instance_to_server.client;

import send_instance_to_server.user.model.User;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ConnectionController {

    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    private ConnectionController() {
        try {
            socket = new Socket("localhost", 4444);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final class SingletonHolder {
        private static final ConnectionController SINGLETON = new ConnectionController();
    }

    public static ConnectionController getInstance() {
        return SingletonHolder.SINGLETON;
    }

    public boolean register(String username, String password) {
        try {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            out.writeObject(user);
            return (Boolean) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
