package service;

import javax.ejb.Stateless;

@Stateless
public class MyService {

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
