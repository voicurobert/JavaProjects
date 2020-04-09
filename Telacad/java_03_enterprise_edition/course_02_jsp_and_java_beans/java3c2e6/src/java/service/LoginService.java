/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author robert
 */
public class LoginService {
    
    private LoginService() {
        
    }
    
    private static final class SingletonHolder {
        private static LoginService SINGELTON = new LoginService();
    }
    
    public static LoginService getInstance() {
        return SingletonHolder.SINGELTON;
    }
    
    public boolean login(String username, String password) {
        if ("gigel".equals(username) && "12345".equals(password)) {
            return true;
        }
        return false;
    }
}
