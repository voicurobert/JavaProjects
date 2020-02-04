package java_professional.chapter_06_user_interface;

import javax.swing.*;
import java.awt.*;

public class Fereastra4 extends JFrame {

    private JButton b1, b2, b3, b4, b5;

    public Fereastra4() {
        super("Fereastra");

        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("East");
        b4 = new JButton("West");
        b5 = new JButton("Centre");
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Fereastra4();
    }

}
