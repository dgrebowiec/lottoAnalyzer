package pl.lottoanalyzer.services.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lottoanalyzer.dao.DrawnNumberDao;
import pl.lottoanalyzer.dto.DrawnNumberDto;
import pl.lottoanalyzer.model.lotto.DrawnNumber;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
@Service
public class DrawnNumberService {

    @Autowired
    DrawnNumberDao drawnNumberDao;

    public void save(DrawnNumberDto drawnNumberDto){
        drawnNumberDao.save(drawnNumberDto.getEntity());

    }
//    public void isNumberExist(Long number){
//        drawnNumberDao.
//    }

}
