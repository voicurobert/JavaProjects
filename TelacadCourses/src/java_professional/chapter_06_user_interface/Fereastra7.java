package java_professional.chapter_06_user_interface;

import javax.swing.*;
import java.awt.*;

public class Fereastra7 extends JFrame {

    private JPanel p1, p2, p3;
    private JLabel l1, l2;
    private JTextField t1;
    private JPasswordField t2;
    private JButton b1;

    public Fereastra7() {
        super("Fereastra");
        setLayout(new GridLayout(3, 1));

        p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p3 = new JPanel();
        add(p1);
        add(p2);
        add(p3);

        l1 = new JLabel("Username");
        l2 = new JLabel("Password");

        t1 = new JTextField(10);
        t2 = new JPasswordField(10);

        b1 = new JButton("Login");
        b1.addActionListener(e -> login());

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);

        p3.add(b1);

        pack();

        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);

    }

    private void login() {
        String username = t1.getText();
        String password = new String(t2.getPassword());

        if ("gigel".equals(username) && "1234".equals(password)) {
            JOptionPane.showMessageDialog(this, "Login successful");
        } else {
            JOptionPane.showMessageDialog(this, "Login unsuccessful");
        }
    }

    public static void main(String[] args) {
        new Fereastra7();
    }


}
