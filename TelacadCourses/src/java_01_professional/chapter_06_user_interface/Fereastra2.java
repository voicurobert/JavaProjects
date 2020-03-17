package java_01_professional.chapter_06_user_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fereastra2 extends JFrame {

    private JButton button;

    public Fereastra2() {
        super("Fereastra");

        setLayout(new FlowLayout());

        button = new JButton("Hello");
        add(button);
        // clasa anonima
        /*
        button.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
                if( button.getText().equals( "Hello" ) ){
                    button.setText( "World" );
                }else{
                    button.setText( "Hello" );
                }
            }
        } );
        */
        // expresie lambda

        button.addActionListener(e -> modificaButonText());

        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    private void modificaButonText() {
        if (button.getText().equals("Hello")) {
            button.setText("World");
        } else {
            button.setText("Hello");
        }
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
        new Fereastra2();
    }

}
