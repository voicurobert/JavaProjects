package rmi_exemplu2_file_manager.client;

import rmi_exemplu2_file_manager.client.gui.MainFrame;

import javax.swing.*;

public class Client {
    public static void main(String[] args) {
        try {
            activateMainFrame();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void activateMainFrame() {
        JFrame frame = new JFrame("Exemplu");
        frame.setContentPane(new MainFrame().getPanel());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
