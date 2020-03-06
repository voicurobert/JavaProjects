package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // rollbacks the RuntimeException that are propagated from the method, not catch
    // by default but not checked exception
    // aspect will not see the catching of the expection
    @Transactional
    public void addOneProduct() {
        productRepository.addProduct("Beer");
        try {
            throw new RuntimeException(":(");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }


}
