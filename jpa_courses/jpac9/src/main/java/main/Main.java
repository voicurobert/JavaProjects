package main;

import main.entities.*;
import main.entities.enums.PhoneType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        /*
        Person p = new Person();
        p.setName("alex");

        p.setPhoneNumber(new HashMap<>());
        p.getPhoneNumber().put(PhoneType.MOBILE, "2314131");
        p.getPhoneNumber().put(PhoneType.HOME, "3131344");

        em.persist(p);
        */

        /*
        Student s = new Student();
        s.setName("baby");

        Professor p = new Professor();
        p.setName("Robert");
        p.setStudents(new HashMap<>());
        p.getStudents().put("calculus", s);

        em.persist(p);
        em.persist(s);
         */

        Department d = new Department();
        d.setName("DDDD");

        Employee e = new Employee();
        e.setName("varza");
        e.setDepartment(d);

        d.setEmployees(new HashMap<>());
        d.getEmployees().put(0, e); // autoincremented - the key makes no sense if auto increment is set

        em.persist(d);
        em.persist(e);


        em.getTransaction().commit();
        em.close();
    }
}
