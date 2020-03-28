package send_instance_to_server.client;

import javax.swing.*;

public class RegisterFrame {
    private JTextField textField1;
    private JButton button1;
    private JPanel panel;
    private JPasswordField passwordField1;

    public RegisterFrame() {
        button1.addActionListener(e -> register());
    }

    private void register() {
        String username = textField1.getText();
        String password = new String(passwordField1.getPassword());
        boolean rez = ConnectionController.getInstance().register(username, password);
        if (rez) {
            JOptionPane.showMessageDialog(null, "User registered");
        } else {
            JOptionPane.showMessageDialog(null, "User not registered");
        }
    }

    public JPanel getPanel() {
        return panel;
    }
}
