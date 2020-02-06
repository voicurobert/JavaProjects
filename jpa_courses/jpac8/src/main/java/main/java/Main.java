package main.java;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.entities.Department;
import main.java.entities.DepartmentDetails;
import main.java.entities.Employee;
import main.java.entities.Professor;
import main.java.entities.ProfessorDetails;
import main.java.entities.Student;


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
        
        Professor p = new Professor();
        p.setName("professor");
        
        Student s = new Student();
        s.setName("student");
        
        ProfessorDetails pd = new ProfessorDetails();
        pd.setProfessors(Arrays.asList(p));
        s.setProfessorDetails(pd);
        
        em.persist(p);
        em.persist(s);
        
        em.getTransaction().commit();
        em.close();
    }
    
}
