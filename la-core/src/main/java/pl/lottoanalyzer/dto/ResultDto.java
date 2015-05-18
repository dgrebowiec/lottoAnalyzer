package pl.lottoanalyzer.dto;

import java.util.List;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
public class ResultDto {
    private List<DrawnNumberDto> drawnNumbersDto;
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
}
