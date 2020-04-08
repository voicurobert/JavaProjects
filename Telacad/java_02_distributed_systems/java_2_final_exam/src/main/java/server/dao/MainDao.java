package server.dao;

import javax.persistence.EntityManager;

public abstract class MainDao {
    private EntityManager entityManager;

    public MainDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
