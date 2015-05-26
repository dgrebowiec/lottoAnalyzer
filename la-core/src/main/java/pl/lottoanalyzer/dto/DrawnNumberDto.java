package pl.lottoanalyzer.dto;

import pl.lottoanalyzer.dto.template.IDto;
import pl.lottoanalyzer.model.lotto.DrawnNumber;
import pl.lottoanalyzer.model.lotto.Lot;

import java.util.HashSet;
import java.util.Set;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
public class DrawnNumberDto implements IDto<DrawnNumber> {

    private Long drawnNumberId;
    private Integer numberVal;

    public DrawnNumberDto(Integer numberVal) {
        this.numberVal = numberVal;
    }

    @Override
    public DrawnNumber getEntity() {
        DrawnNumber drawnNumber = new DrawnNumber();
        drawnNumber.setDrawnNumberId(drawnNumberId);
        drawnNumber.setNumberVal(numberVal);
        return drawnNumber;
    }

    public Long getDrawnNumberId() {
        return drawnNumberId;
    }

    public void setDrawnNumberId(Long drawnNumberId) {
        this.drawnNumberId = drawnNumberId;
    }

    public Integer getNumberVal() {
        return numberVal;
    }

    public void setNumberVal(Integer numberVal) {
        this.numberVal = numberVal;
    }

}
