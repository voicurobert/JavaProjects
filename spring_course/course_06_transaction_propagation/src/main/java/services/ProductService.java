package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {
    /**
     * REQUIRED (default)
     *      - creates a transaction when it does not exists and uses it
     * REQUIRES_NEW
     *      - always creates a new transaction, even if a transaction exists
     * MANDATORY
     *      - makes sure that the method has a transaction, it will fail if no transaction was started
     * NEVER
     *      - marks method to not use transaction, but if a transaction exists it will throw and error
     * SUPPORTS
     *      - the method can be called with or without a transaction. if a transaction exists, it will run under that transaction
     * NOT_SUPPORTED
     *      - doesn't creates transactions
     *      - avoid using transactions
     *      - runs in a non transactional way even if a transaction exists or not
     * NESTED
     *      - creates transactions under other transactions. if the main transaction rollbacks, then the nested transactions will rollback as well. if a nested transaction rollbacks
     *      then the main transaction will continue
     */

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public void addTenProducts(){ // transaction is created
        for (int i = 1; i <= 10; i++) {
            productRepository.addProduct("Product" + i); // using the same transaction
            if (i == 5) {
              //  throw  new RuntimeException(":("); // marks for rollback the transaction
            }
        }
    } // transaction commits
}
