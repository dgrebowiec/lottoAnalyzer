package pl.lottoanalyzer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: mgalezewska
 * Date: 2015-04-12
 */
public class GenerateMain {

    public static void main(String[] args){
      /*  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dataSource");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(new Result());
        entityManager.getTransaction().commit();*/

        new ClassPathXmlApplicationContext("applicationContext-hibernate.xml");
    }

}
