package client.main;

import client.gui.UserLogin;

import javax.swing.*;
import java.awt.*;

public class Client {
    public static void main(String[] args) {
        new UserLogin();
    }

    private static void activeUserLoginFrame(){
        JFrame frame = new JFrame();
        Dimension dimension = new Dimension();
        dimension.setSize(200, 300);
        frame.setMinimumSize(dimension);
        frame.setContentPane(new UserLogin().getMainPanel());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
