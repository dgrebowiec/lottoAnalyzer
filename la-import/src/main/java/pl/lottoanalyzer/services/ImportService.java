package pl.lottoanalyzer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.lottoanalyzer.dao.DrawnNumberDao;
import pl.lottoanalyzer.dao.IDrawnNumberDao;
import pl.lottoanalyzer.dao.ILotDao;
import pl.lottoanalyzer.dao.LotDao;
import pl.lottoanalyzer.dto.DrawnNumberDto;
import pl.lottoanalyzer.dto.LotDto;
import pl.lottoanalyzer.dto.ResultDto;
import pl.lottoanalyzer.model.lotto.DrawnNumber;
import pl.lottoanalyzer.model.lotto.Lot;
import pl.lottoanalyzer.services.lotto.DrawnNumberService;
import pl.lottoanalyzer.utils.DrawnNumberUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
@Service
public class ImportService {

    @Autowired
    IDrawnNumberDao drawnNumberDao;

    @Autowired
    ILotDao lotDao;


    @Transactional
    public void saveAllResults(List<ResultDto> resultsDto){
        saveDrawnNumbers();
        for(ResultDto resultDto : resultsDto){
            saveResult(resultDto);
        }
    }


    private void saveResult(ResultDto resultDto){
        // 1 zapisz losowanie
        saveLot(resultDto);
        // 2 zapisz wylosowane liczby

        // 3 zapisz relacje

    }

    @Transactional
    private void saveDrawnNumbers(){
        for(Integer number : DrawnNumberUtil.NUMBERS){
            DrawnNumberDto drawnNumberDto = new DrawnNumberDto(number);
            drawnNumberDao.save(drawnNumberDto.getEntity());
        }
    }

    private void saveLot(ResultDto resultDto){
        LotDto lotDto = resultDto.getLotDto();
        Set<DrawnNumber> drawnNumbers = drawnNumberDao.findByNumberValIn(resultDto.getDrawnNumbers());
        lotDto.setDrawnNumbers(drawnNumbers);
        lotDao.save(lotDto.getEntity());
    }


}
