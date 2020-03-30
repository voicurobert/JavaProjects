package client.gui;

import client.controller.ClientController;
import library.db.Clasa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class MainFrame {
    private JPanel mainPanel;
    private JButton cursuriButton;
    private JList list1;

    private DefaultListModel<Clasa> model;

    public MainFrame() {
        model = new DefaultListModel<>();
        list1.setModel(model);
        afisareClase();
        cursuriButton.addActionListener(e -> activateCursFrame());
        list1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    removeClasa();
                }
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void afisareClase() {
        List<Clasa> clase = ClientController.getInstance().getClase();
        model.clear();
        clase.forEach(model::addElement);
    }

    private void activateCursFrame() {
        JFrame frame = new JFrame();
        Dimension dimension = new Dimension();
        dimension.setSize(200, 500);
        frame.setMinimumSize(dimension);
        frame.setContentPane(new CursFrame(frame).getPanel1());

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void removeClasa() {
        Clasa clasa = (Clasa) list1.getSelectedValue();
        ClientController.getInstance().removeClasa(clasa);
        afisareClase();
    }
}
