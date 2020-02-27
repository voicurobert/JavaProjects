package services;

import entities.Product;
import repositories.ProductRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProductService {

    private final EntityManagerFactory entityManagerFactory;

    public ProductService() {
        entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit");

    }

    public void addProduct(String name){
        EntityManager em = entityManagerFactory.createEntityManager();
        ProductRepository  productRepository = new ProductRepository(em);

        Product p = new Product();
        p.setName(name);

        try {
            em.getTransaction().begin();
            productRepository.addProduct(p);
            em.getTransaction().commit();
        } catch (RuntimeException e){
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public List<Product> findProducts(){
        EntityManager em = entityManagerFactory.createEntityManager();
        ProductRepository  productRepository = new ProductRepository(em);

        return productRepository.findAllProducts();
    }
}
