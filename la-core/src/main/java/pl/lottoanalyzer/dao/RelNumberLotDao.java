package pl.lottoanalyzer.dao;

import org.springframework.stereotype.Repository;
import pl.lottoanalyzer.dao.template.TemplateJpaDao;
import pl.lottoanalyzer.model.lotto.RelNumberLot;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
@Repository
public class RelNumberLotDao extends TemplateJpaDao<RelNumberLot> {
}
