package pl.lottoanalyzer.dao;

import pl.lottoanalyzer.model.Result;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * User: mgalezewska
 * Date: 2015-05-13
 */

public class TemplateJpaDao<T> implements IDao<T> {

    @PersistenceContext
    private EntityManager managerFactory;

    @Override
    public void save(Object entity) {
        managerFactory.persist(entity);
    }

    @Override
    public List<Result> findAll() {
        return null;
    }
}
