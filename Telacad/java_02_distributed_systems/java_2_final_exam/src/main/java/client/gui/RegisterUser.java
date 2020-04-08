package client.gui;

import client.controller.UserController;
import client.gui.exceptions.NoValueException;
import client.gui.exceptions.NoValuePresentException;
import lib.db.User;

import javax.swing.*;
import java.awt.*;

public class RegisterUser extends JFrame{
    private JPanel panel1;
    private JTextField usernameTextField;
    private JButton registerButton;
    private JLabel passwordLabel;
    private JPasswordField passwordTextField;

    public RegisterUser() {
        setContentPane(panel1);
        Dimension dimension = new Dimension();
        dimension.setSize(300, 200);
        setMinimumSize(dimension);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        registerButton.addActionListener(e -> registerNewUser());
    }

    private void registerNewUser() {
        String username;
        String password;
        try {
            username = FieldController.validateUsernameTextField(usernameTextField);
            password = FieldController.validatePasswordTextField(passwordTextField);
        } catch (NoValuePresentException | NoValueException e) {
            GuiAlerts.getInstance().showAlertWithMessage(e.getMessage());
            return;
        }
        if (UserController.getInstance().usernameExists(username)) {
            GuiAlerts.getInstance().showAlertWithMessage("Username is already taken, sorry. Pick another one!");
            return;
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        UserController.getInstance().addUser(user);
        GuiAlerts.getInstance().showAlertWithMessage("User successfully created!");
        dispose();
    }
}
