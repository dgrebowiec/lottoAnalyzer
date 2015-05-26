package pl.lottoanalyzer.dao.template;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

/**
 * User: mgalezewska
 * Date: 2015-05-13
 */
@Transactional
public class TemplateJpaDao<T, ID extends Serializable> implements IDao<T, ID> {

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
