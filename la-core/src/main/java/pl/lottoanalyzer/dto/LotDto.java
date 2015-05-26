package pl.lottoanalyzer.dto;

import pl.lottoanalyzer.dto.template.IDto;
import pl.lottoanalyzer.model.lotto.DrawnNumber;
import pl.lottoanalyzer.model.lotto.Lot;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
public class LotDto implements IDto<Lot> {

    Long lotId;
    Long lotNumber;
    Date lotDate;
    private Set<DrawnNumber> drawnNumbers = new HashSet<DrawnNumber>(0);

    public LotDto(Long lotNumber, Date lotDate) {
        this.lotNumber = lotNumber;
        this.lotDate = lotDate;
    }

    @Override
    public Lot getEntity() {
        Lot lot = new Lot();
        lot.setLotId(lotId);
        lot.setLotNumber(lotNumber);
        lot.setLotDate(lotDate);
        lot.setDrawnNumbers(drawnNumbers);
        return lot;
    }

    public Long getLotId() {
        return lotId;
    }

    public void setLotId(Long lotId) {
        this.lotId = lotId;
    }

    public Long getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(Long lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Date getLotDate() {
        return lotDate;
    }

    public void setLotDate(Date lotDate) {
        this.lotDate = lotDate;
    }

    public Set<DrawnNumber> getDrawnNumbers() {
        return drawnNumbers;
    }

    public void setDrawnNumbers(Set<DrawnNumber> drawnNumbers) {
        this.drawnNumbers = drawnNumbers;
    }
}
