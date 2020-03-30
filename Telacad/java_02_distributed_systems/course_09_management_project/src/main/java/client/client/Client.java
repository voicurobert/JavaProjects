package client.client;

import client.gui.MainFrame;

import javax.swing.*;
import java.awt.*;

public class Client {
    public static void main(String[] args) {
        try {
            activateFrame();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void activateFrame() {
        JFrame frame = new JFrame();
        Dimension dimension = new Dimension();
        dimension.setSize(500, 500);
        frame.setMinimumSize(dimension);
        frame.setContentPane(new MainFrame().getMainPanel());

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
