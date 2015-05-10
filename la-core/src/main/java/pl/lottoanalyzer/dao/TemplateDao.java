package pl.lottoanalyzer.dao;

        import org.hibernate.Session;
        import org.hibernate.SessionFactory;
        import org.hibernate.Transaction;
        import org.springframework.beans.factory.annotation.Autowired;

        import java.io.Serializable;

/**
 * User: mgalezewska
 * Date: 2015-05-09
 */
public class TemplateDao<T> implements IDao<T> {

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
}
