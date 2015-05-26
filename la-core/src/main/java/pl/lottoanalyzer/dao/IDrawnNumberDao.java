package pl.lottoanalyzer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lottoanalyzer.model.lotto.DrawnNumber;

import java.util.List;
import java.util.Set;

/**
 * User: mgalezewska
 * Date: 2015-05-25
 */
@Repository
public interface IDrawnNumberDao extends JpaRepository<DrawnNumber, Long> {

    Set<DrawnNumber> findByNumberValIn(List<Integer> numbersVal);
}
