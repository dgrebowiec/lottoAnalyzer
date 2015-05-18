package pl.lottoanalyzer.dto;

import pl.lottoanalyzer.dto.template.IDto;
import pl.lottoanalyzer.model.lotto.Lot;

import java.util.Date;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
public class LotDto implements IDto<Lot> {
    Long lotId;
    Long lotNumber;
    Date lotDate;

    public LotDto(Long lotNumber, Date lotDate) {
        this.lotNumber = lotNumber;
        this.lotDate = lotDate;
    }

    @Override
    public Lot getEntity() {
        Lot lot = new Lot();
        lot.setLotId(lotId);
        lot.setLotNumber(lotNumber);
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
}
