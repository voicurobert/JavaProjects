package messenger.frame;

import javax.swing.*;

public class MainFrame extends JFrame{
    private JPanel panel1;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton button1;

    public MainFrame() {
        setLocationRelativeTo(null);
        setVisible(true);

        panel1.setVisible(true);

        textArea1 = new JTextArea();
        textArea2 = new JTextArea();


        textArea1.setEditable(false);

        button1 = new JButton();
        button1.addActionListener(e -> sendMessage());
    }

    private void sendMessage() {
        String message = textArea2.getText();

    }
}
