package ma.formation.jdbc.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("tp7-unit");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
