package pl.lottoanalyzer.services.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lottoanalyzer.dao.LotDao;
import pl.lottoanalyzer.dto.LotDto;
import pl.lottoanalyzer.model.lotto.Lot;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
@Service
public class LotService {
    @Autowired
    LotDao lotDao;

    public void saveLot(LotDto lotDto){
        Lot lot = lotDto.getEntity();
        lotDao.save(lot);
    }
}
