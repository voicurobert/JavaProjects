package client.controller;

import lib.db.CarRental;
import lib.db.User;
import lib.rmi.IUserService;
import java.util.Collections;
import java.util.List;

public class UserController {
    private IUserService userService;

    private UserController() {
        try {
            userService = (IUserService) RegistryController.getInstance().getRegistry().lookup("userService");
        } catch (Exception e) {

        }
    }

    private static final class SingletonHolder {
        private static final UserController SINGLETON = new UserController();
    }

    public static UserController getInstance() {
        return SingletonHolder.SINGLETON;
    }

    public void addUser(User user) {
        try {
            userService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean usernameExists(String username) {
        try {
            return userService.usernameExists(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public User loginUser(String username, String pasword) {
        try {
            return userService.loginUser(username, pasword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
