package pl.lottoanalyzer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lottoanalyzer.dao.DrawnNumberDao;
import pl.lottoanalyzer.dao.LotDao;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */

@Service
public class LottoService {

    @Autowired
    LotDao lotDao;

    @Autowired
    DrawnNumberDao drawnNumberDao;

    public void saveResult(){

    }

}
