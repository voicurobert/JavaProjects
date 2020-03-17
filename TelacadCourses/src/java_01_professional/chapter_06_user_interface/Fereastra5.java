package java_01_professional.chapter_06_user_interface;

import javax.swing.*;
import java.awt.*;

public class Fereastra5 extends JFrame {

    private JButton b1, b2, b3;
    private JPanel p, p2;

    public Fereastra5() {
        super("Fereastra");

        p = new JPanel();
        p2 = new JPanel();
        add(p, BorderLayout.SOUTH);
        add(p2);
        b1 = new JButton("Red");
        b2 = new JButton("Green");
        b3 = new JButton("Blue");

        b1.addActionListener(e -> p2.setBackground(Color.red));
        b2.addActionListener(e -> p2.setBackground(Color.green));
        b3.addActionListener(e -> p2.setBackground(Color.blue));

        p.add(b1);
        p.add(b2);
        p.add(b3);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Fereastra5();
    }

}
