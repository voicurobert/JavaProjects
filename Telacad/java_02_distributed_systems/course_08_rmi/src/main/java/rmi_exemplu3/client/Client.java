package rmi_exemplu3.client;

import rmi_exemplu3.client.gui.MainFrame;

import javax.swing.*;

public class Client {
    public static void main(String[] args) {
        activateMainFrame();
    }

    private static void activateMainFrame() {
        JFrame frame = new JFrame("Produs service");
        frame.setContentPane(new MainFrame().getPanel());

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
