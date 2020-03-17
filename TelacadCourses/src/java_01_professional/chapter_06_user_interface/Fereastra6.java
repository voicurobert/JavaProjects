package java_01_professional.chapter_06_user_interface;

import javax.swing.*;
import java.awt.*;

public class Fereastra6 extends JFrame {

    private JButton[] b = new JButton[12];

    public Fereastra6() {
        setLayout(new GridLayout());

        for (int i = 0; i < b.length; i++) {
            b[i] = new JButton(String.valueOf(i + 1));
            add(b[i]);
        }

        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Fereastra6();
    }
}
