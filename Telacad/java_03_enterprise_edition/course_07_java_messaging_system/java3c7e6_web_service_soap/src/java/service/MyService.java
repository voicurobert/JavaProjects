package service;

import javax.ejb.Stateless;


@Stateless
public class MyService {

    public void useCase(String nume) {
        System.out.println("Hello," + nume);
    }
}
