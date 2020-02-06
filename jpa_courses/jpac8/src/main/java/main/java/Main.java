package main.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.entities.Department;
import main.java.entities.DepartmentDetails;
import main.java.entities.Employee;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
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
        
        
        
        em.getTransaction().commit();
        em.close();
    }
    
}
