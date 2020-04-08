package client.gui;

import client.controller.UserController;
import client.gui.exceptions.NoValueException;
import client.gui.exceptions.NoValuePresentException;
import lib.db.User;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class UserLogin extends JFrame {
    private JPanel mainPanel;
    private JButton loginButton;
    private JButton registerButton;
    private JTextField usernameTextField;
    private JPasswordField passwordTextField;

    public UserLogin() {
        Dimension dimension = new Dimension();
        dimension.setSize(300, 400);
        setMinimumSize(dimension);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        loginButton.addActionListener(e -> login());
        registerButton.addActionListener(e -> register());
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void login() {
        String username;
        String password;
        try {
            username = FieldController.validateUsernameTextField(usernameTextField);
            password = FieldController.validatePasswordTextField(passwordTextField);
        } catch (NoValuePresentException | NoValueException e) {
            GuiAlerts.getInstance().showAlertWithMessage(e.getMessage());
            return;
        }
        try {
            Optional<User> user = Optional.of(UserController.getInstance().loginUser(username, password));
            activateMainGuiForUser(user.get());
            dispose();
        } catch (NullPointerException e) {
            GuiAlerts.getInstance().showAlertWithMessage("User not found!");
            return;
        }
    }

    private void activateMainGuiForUser(User user) {
        new MainGui(user);
    }

    private void register() {
        activateRegisterUserGui();
    }

    private void activateRegisterUserGui(){
        new RegisterUser();
    }
}
