package send_instance_to_server.client;

import javax.swing.*;

public class Client {
    public static void main(String[] args) {
        activateFrame();
    }

    private static void activateFrame() {
        JFrame frame = new JFrame("Register User");
        frame.setContentPane(new RegisterFrame().getPanel());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
