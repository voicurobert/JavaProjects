package messenger.frame;

import messenger.client.ClientMessageListener;
import messenger.client.ConnectionController;
import messenger.client.DisplayThread;

import javax.swing.*;

public class MainFrame extends JFrame implements ClientMessageListener {
    private JPanel panel1;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton button1;
    private String name;

    private DisplayThread displayThread;

    public MainFrame(String name) {
        setLocationRelativeTo(null);
        this.name = name;
        button1.addActionListener(e -> sendMessage());
        button1.setEnabled(true);
        button1.setText("Send");
        textArea2.setEditable(true);
        textArea1.setEditable(false);

        displayThread = new DisplayThread();
        displayThread.addClientMessageListener(this);
    }

    private void startDisplayThread() {
        displayThread.start();
    }

    private void sendMessage() {
        String message = textArea2.getText();
        ConnectionController.getInstance().sendMessage(this.name + " " + message);
        textArea2.setText(null);
    }

    public JPanel getPanel1() {
        return panel1;
    }

    @Override
    public void messageReceived(String message) {
        try {
            System.out.println(message);
            SwingUtilities.invokeAndWait(() -> textArea1.append(message + "\n"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
