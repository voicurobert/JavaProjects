package main.java;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.entities.*;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        /*
        Department d1 = new Department();
        d1.setName("bla");
        
        DepartmentDetails dd = new DepartmentDetails();
        dd.setContractNo("1");
        dd.setDepartment(d1);
        
        Employee e = new Employee();
        e.setDepartmentDetails(dd);
        e.setName("E");
        
        em.persist(e);
        em.persist(d1);
        */

        /*
        Professor p = new Professor();
        p.setName("professor");
        
        Student s = new Student();
        s.setName("student");
        
        ProfessorDetails pd = new ProfessorDetails();
        pd.setProfessors(Arrays.asList(p));
        s.setProfessorDetails(pd);
        
        em.persist(p);
        em.persist(s);

         */
        Person p = new Person();
        p.setName("P");
        p.setPhoneNumbers(Arrays.asList("22313", "1312313", "3314"));

        Document d = new Document();
        d.setNumber("123123");
        d.setReference("ss21");

        p.setDocuments(Arrays.asList(d));
        em.persist(p);

        em.getTransaction().commit();
        em.close();
    }
    
}
