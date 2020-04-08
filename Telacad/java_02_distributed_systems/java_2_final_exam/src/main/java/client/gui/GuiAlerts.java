package client.gui;

import javax.swing.*;

public class GuiAlerts {
    private GuiAlerts() {

    }

    private static final class SingletonHolder {
        private static final GuiAlerts SINGLETON = new GuiAlerts();
    }

    public static GuiAlerts getInstance() {
        return SingletonHolder.SINGLETON;
    }

    public void showAlertWithMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
