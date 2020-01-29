/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entities.Product;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistance-unit");
        EntityManager em = emf.createEntityManager();
        
        Product p = new Product();
        p.setId(100);
        p.setName("Beer");
        p.setPrice(20.5);
        p.setExpirationDate(LocalDate.now());
        
        try {
            em.getTransaction().begin();
            
            em.persist(p); // adding the instance in the context
            
            em.getTransaction().commit();
            
        } catch ( Exception e ){
            em.getTransaction().rollback();
        }
        
    }
}
