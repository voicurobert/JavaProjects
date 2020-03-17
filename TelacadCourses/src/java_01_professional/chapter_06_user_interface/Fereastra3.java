package java_01_professional.chapter_06_user_interface;

import javax.swing.*;
import java.awt.*;

public class Fereastra3 extends JFrame {

    private JButton button;
    private int counter = 0;

    public Fereastra3() {
        super("Fereastra");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        button = new JButton("Hello - " + counter);
        add(button);

        // expresie lambda

        button.addActionListener(e -> increment());

        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void increment() {
        counter++;
        button.setText("Hello - " + counter);
    }


    public static void main(String[] args) {
        new Fereastra3();
    }

}
