package main;

import config.ProjectConfig;
import demo.Person;
import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
//            ProductRepository productRepository = context.getBean(ProductRepository.class);
//
//            Product product = new Product();
//            product.setName("Bere");
//            product.setPrice(22);
//
//            //productRepository.addProduct(product);
//            System.out.println(productRepository.getProducts());

            Person p = context.getBean(Person.class);
            p.sayHello("Bill");
        }
    }
}
