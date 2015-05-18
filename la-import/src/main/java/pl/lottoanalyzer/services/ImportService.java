package pl.lottoanalyzer.services;

import org.springframework.beans.factory.annotation.Autowired;
import pl.lottoanalyzer.dao.LotDao;
import pl.lottoanalyzer.dto.DrawnNumberDto;
import pl.lottoanalyzer.dto.LotDto;
import pl.lottoanalyzer.dto.ResultDto;
import pl.lottoanalyzer.model.lotto.Lot;
import pl.lottoanalyzer.services.lotto.DrawnNumberService;

import java.util.List;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
public class ImportService {

    @Autowired
    DrawnNumberService drawnNumberService;

    @Autowired
    LotDao lotDao;

    public void saveAllResults(List<ResultDto> resultsDto){

    }

    public void saveResult(ResultDto resultDto){
        // 1 zapisz wylosowane liczby
        saveDrawnNumbers(resultDto.getDrawnNumbersDto());
        // 2 zapisz losowanie
        saveLot(resultDto.getLotDto());
        // 3 zapisz relacje

    }


    public void saveDrawnNumbers(List<DrawnNumberDto> drawnNumbersDto){
        for (DrawnNumberDto drawnNumberDto : drawnNumbersDto){
            drawnNumberService.save(drawnNumberDto);
        }
    }

    public void saveLot(LotDto lotDto){
        lotDao.save(lotDto.getEntity());
    }

//    public void

}
