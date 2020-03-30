package client.gui;

import client.controller.ClientController;
import library.db.Curs;

import javax.swing.*;
import java.util.List;

public class CursFrame {
    private JList list1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton adaugaCursButton;
    private JFrame frame;
    private DefaultListModel<Curs> model;

    public CursFrame(JFrame frame) {
        this.frame = frame;
        adaugaCursButton.addActionListener(e -> addCurs());
        model = new DefaultListModel<>();
        list1.setModel(model);
        afisareCursuri();
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private void addCurs(){
        String name = textField1.getText();
        Curs curs = new Curs();
        curs.setNume(name);
        ClientController.getInstance().addCurs(curs);
        JOptionPane.showMessageDialog(frame, "S-a adaugat un curs");
        afisareCursuri();
    }

    private void afisareCursuri(){
        model.clear();
        List<Curs> cursuri = ClientController.getInstance().getCursuri();
        cursuri.forEach(model::addElement);
    }
}
