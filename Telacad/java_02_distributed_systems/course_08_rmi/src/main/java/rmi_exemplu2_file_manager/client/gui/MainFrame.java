package rmi_exemplu2_file_manager.client.gui;

import rmi_exemplu2_file_manager.client.controller.ClientController;

import javax.swing.*;

public class MainFrame {
    private JTextArea textArea1;
    private JButton listButton;
    private JButton createButton;
    private JPanel panel;

    public MainFrame() {
        textArea1.setEditable(false);
        listButton.addActionListener(e -> list());
        createButton.addActionListener(e -> createFile());
    }

    public JPanel getPanel() {
        return panel;
    }

    private void list() {
        String fileLocation = JOptionPane.showInputDialog("File location: ");
        String res = ClientController.getInstance().list(fileLocation);
        textArea1.append(res + "\n");
    }

    private void createFile() {
        String fileLocation = JOptionPane.showInputDialog("File location: ");
        ClientController.getInstance().createFile(fileLocation);
        textArea1.append("file created");
    }
}
