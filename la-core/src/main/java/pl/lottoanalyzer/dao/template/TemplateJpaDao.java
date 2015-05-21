package pl.lottoanalyzer.dao.template;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * User: mgalezewska
 * Date: 2015-05-13
 */

public class TemplateJpaDao<T> implements IDao<T> {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public void save(Object entity) {
        entityManager.persist(entity);
        entityManager.flush();
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
