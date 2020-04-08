package client.gui;

import client.gui.exceptions.NoValueException;
import client.gui.exceptions.NoValuePresentException;
import javax.swing.*;
import java.util.Collections;
import java.util.regex.Pattern;

public class FieldController {
    private FieldController() {

    }

    private static final class SingletonHolder {
        private static final FieldController SINGLETON = new FieldController();
    }

    private static FieldController getInstance() {
        return SingletonHolder.SINGLETON;
    }

    public static String validatePasswordTextField(JPasswordField passwordField) throws NoValuePresentException, NoValueException {
        StringBuilder sb = new StringBuilder();
        Collections.singletonList(passwordField.getPassword()).forEach(sb::append);
        String pass = sb.toString();
        if (pass.equals("")) {
            throw new NoValuePresentException("You have to set a password");
        } else if (pass.equals(" ")) {
            throw new NoValueException("You cannot set an empty password");
        }
        return pass;
    }

    public static String validateUsernameTextField(JTextField textField) throws NoValuePresentException, NoValueException {
        String text = textField.getText();
        if (text.equals("")) {
            throw new NoValuePresentException("You have to set an username");
        } else if (text.equals(" ")) {
            throw new NoValueException("You cannot set an empty username");
        }
        return text;
    }

    public static String validateStringTextField(JTextField textField) throws NoValuePresentException, NoValueException {
        String text = textField.getText();
        if (text.equals("")) {
            throw new NoValuePresentException("You have to set a value");
        } else if (text.equals(" ")) {
            throw new NoValueException("You cannot set an empty value");
        } else if(Pattern.compile("(.)*(\\d)(.)*").matcher(text).matches()) {
            throw new NumberFormatException("You cannot have digits!");
        }
        return text;
    }

    public static Integer validateIntegerTextField(JTextField textField) throws NoValuePresentException, NoValueException {
        String text = textField.getText();
        if (text.equals("")) {
            throw new NoValuePresentException("You have to set a value");
        } else if (text.equals(" ")) {
            throw new NoValueException("You cannot set an empty value");
        } else if(Pattern.compile("[a-z]").matcher(text.toLowerCase()).matches()) {
            throw new NumberFormatException("You cannot have letters!");
        }
        return Integer.valueOf(text);
    }
}
