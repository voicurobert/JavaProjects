package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {

    /**
     * DEFAULT
     *      - is taken from the DB -> read committed
     * READ_UNCOMMITED
     * READ_COMMITED
     * REPEATABLE_READ
     * SERIALIZABLE
     *
     * Problems:
     *  - dirty reads:
     *  - repeatable reads
     *  - phantom reads
     */

    @Autowired
    private ProductRepository productRepository;

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void addTenProducts() {
        for (int i = 0; i < 11; i++) {
            productRepository.addProduct("Product" + i);
        }
    }

}
