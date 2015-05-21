package pl.lottoanalyzer.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.lottoanalyzer.dao.template.TemplateJpaDao;
import pl.lottoanalyzer.model.lotto.DrawnNumber;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
@Repository
public class DrawnNumberDao extends TemplateJpaDao<DrawnNumber> {

    public DrawnNumber findNumberByNumber(Long number){

        /*
        EntityManager em = ...;
CriteriaBuilder cb = em.getCriteriaBuilder();
CriteriaQuery<Pet> cq = cb.createQuery(Pet.class);
Root<Pet> pet = cq.from(Pet.class);
cq.select(pet);
TypedQuery<Pet> q = em.createQuery(cq);
List<Pet> allPets = q.getResultList();
         */
        DrawnNumber drawnNumber = null;
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        CriteriaQuery<DrawnNumber> criteria = cb.createQuery(DrawnNumber.class);
//        Root<DrawnNumber> drawnNumberRoot = criteria.from(DrawnNumber.class);


        return drawnNumber;
    }
}
