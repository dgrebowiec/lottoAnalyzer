package pl.lottoanalyzer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lottoanalyzer.model.lotto.Lot;

/**
 * User: mgalezewska
 * Date: 2015-05-25
 */
@Repository
public interface ILotDao extends JpaRepository<Lot, Long> {
}
