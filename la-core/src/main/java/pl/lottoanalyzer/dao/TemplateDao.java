package pl.lottoanalyzer.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import pl.lottoanalyzer.model.Result;

import java.io.Serializable;
import java.util.List;

/**
 * User: mgalezewska
 * Date: 2015-05-09
 */
public abstract class TemplateDao<T> implements IDao<T> {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(T t) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(t);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Result> findAll() {
//        Session session = sessionFactory.openSession();
        List<Result> resultList = getCurrentSession().createCriteria(Result.class).list();
        //session.close();
        return resultList;
    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }


}
