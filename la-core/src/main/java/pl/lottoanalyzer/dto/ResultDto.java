package pl.lottoanalyzer.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
public class ResultDto {
    private List<DrawnNumberDto> drawnNumbersDto = new ArrayList<>();
    private List<Integer> drawnNumbers = new ArrayList<>();
    private LotDto lotDto;

    public List<DrawnNumberDto> getDrawnNumbersDto() {
        return drawnNumbersDto;
    }

    public void setDrawnNumbersDto(List<DrawnNumberDto> drawnNumbersDto) {
        this.drawnNumbersDto = drawnNumbersDto;
    }

    public LotDto getLotDto() {
        return lotDto;
    }

    public void setLotDto(LotDto lotDto) {
        this.lotDto = lotDto;
    }

    public List<Integer> getDrawnNumbers() {
        for(DrawnNumberDto drawnNumberDto : drawnNumbersDto){
            drawnNumbers.add(drawnNumberDto.getNumberVal());
        }
        return drawnNumbers;
    }

    public void setDrawnNumbers(List<Integer> drawnNumbers) {
        this.drawnNumbers = drawnNumbers;
    }
}
