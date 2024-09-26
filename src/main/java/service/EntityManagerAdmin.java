package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerAdmin {

    private static final String PERSISTENCE_UNIT_NAME = "DBTEST";

    private static EntityManager instance ;

    private EntityManagerAdmin() {
    }

    public static EntityManager getInstance() {
        if(instance == null) {
            EntityManagerFactory ef = Persistence.
                    createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            instance = ef.createEntityManager();
        }
        return instance;
    }
}
