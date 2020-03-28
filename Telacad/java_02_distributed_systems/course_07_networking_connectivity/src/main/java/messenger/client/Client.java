package messenger.client;

import messenger.frame.MainFrame;

import javax.swing.*;

public class Client {
    public static void main(String[] args) {
        String nume = JOptionPane.showInputDialog("NUME: ");
        activateMainFrame(nume);
    }

    private static void activateMainFrame(String name){
        JFrame frame = new JFrame("Messenger");
        frame.setContentPane(new MainFrame(name).getPanel1());
        frame.pack();
        frame.setVisible(true);
    }
}
