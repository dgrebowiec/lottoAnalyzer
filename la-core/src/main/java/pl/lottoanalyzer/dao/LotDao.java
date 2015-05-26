package pl.lottoanalyzer.dao;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.lottoanalyzer.dao.template.TemplateJpaDao;
import pl.lottoanalyzer.model.lotto.Lot;

import javax.persistence.EntityManager;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
@Repository
public class LotDao extends TemplateJpaDao<Lot, Long> {
}
