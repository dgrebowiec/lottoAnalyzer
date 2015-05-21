package pl.lottoanalyzer.dto;

import pl.lottoanalyzer.dto.template.IDto;
import pl.lottoanalyzer.model.lotto.DrawnNumber;

import java.util.HashSet;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
public class DrawnNumberDto implements IDto<DrawnNumber> {

    private Long drawnNumberId;
    private Long numberVal;

    public DrawnNumberDto(Long numberVal) {
        this.numberVal = numberVal;
    }

    @Override
    public DrawnNumber getEntity() {
        DrawnNumber drawnNumber = new DrawnNumber();
        drawnNumber.setDrawnNumberId(drawnNumberId);
        drawnNumber.setNumberVal(numberVal);
        drawnNumber.setRelNumberLots(new HashSet<>());
        return drawnNumber;
    }

    public Long getDrawnNumberId() {
        return drawnNumberId;
    }

    public void setDrawnNumberId(Long drawnNumberId) {
        this.drawnNumberId = drawnNumberId;
    }

    public Long getNumberVal() {
        return numberVal;
    }

    public void setNumberVal(Long numberVal) {
        this.numberVal = numberVal;
    }
}
