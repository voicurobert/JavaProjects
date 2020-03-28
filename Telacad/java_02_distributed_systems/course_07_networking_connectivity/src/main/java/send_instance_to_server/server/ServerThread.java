package send_instance_to_server.server;

import send_instance_to_server.server.service.RegisterService;
import send_instance_to_server.user.model.User;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public ServerThread(Socket socket) {
        try {
            this.socket = socket;
            this.out = new ObjectOutputStream(socket.getOutputStream());
            this.in = new ObjectInputStream(socket.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                User user = (User)in.readObject();
                boolean rez = RegisterService.getInstance().register(user);
                out.writeObject(rez);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
