package java_01_professional.chapter_06_user_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fereastra1 extends JFrame {

    private JButton button;

    public Fereastra1() {
        super("Fereastra");

        setLayout(new FlowLayout());

        button = new JButton("Hello");
        add(button);
        button.addActionListener(new MyListener());

        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    private class MyListener implements ActionListener {

        @Override public void actionPerformed(ActionEvent e) {
            if (button.getText().equals("Hello")) {
                button.setText("World");
            } else {
                button.setText("Hello");
            }
        }
    }


    public static void main(String[] args) {
        new Fereastra1();
    }

}
