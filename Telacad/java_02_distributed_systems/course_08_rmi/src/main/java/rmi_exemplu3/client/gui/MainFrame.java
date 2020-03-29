package rmi_exemplu3.client.gui;

import rmi_exemplu3.client.controller.ClientController;
import rmi_exemplu3.library.db.Produs;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class MainFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton adaugaButton;
    private JList list1;
    private JPanel panel;
    private JPanel lowerPanel;

    private DefaultListModel<Produs> model;

    public MainFrame() {
        panel.setVisible(true);
        lowerPanel.setVisible(true);
        adaugaButton.setVisible(true);
        textField1.setVisible(true);
        textField2.setVisible(true);
        list1.setVisible(true);
        adaugaButton.addActionListener(ev -> adaugaProdus());
        model = new DefaultListModel<>();
        list1.setModel(model);
        list1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    stergeProdus();
                }
            }
        });
        afisareProduse();
    }

    public JPanel getPanel() {
        return panel;
    }

    private void adaugaProdus() {
        String nume = textField1.getText();
        double pret = Double.parseDouble(textField2.getText());
        Produs produs = new Produs();
        produs.setNume(nume);
        produs.setPret(pret);
        ClientController.getInstance().adaugaProdus(produs);
        JOptionPane.showMessageDialog(null, "A fost adaugat un produs");
        afisareProduse();
    }

    private void afisareProduse(){
        List<Produs> produse = ClientController.getInstance().getAllProducts();
        model.clear();
        produse.forEach(model::addElement);
    }

    private void stergeProdus(){
        Produs produs = (Produs) list1.getSelectedValue();
        ClientController.getInstance().stergeProdus(produs);
        afisareProduse();
    }
}
