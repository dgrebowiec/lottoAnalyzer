package pl.lottoanalyzer.dto;

import pl.lottoanalyzer.dto.template.IDto;
import pl.lottoanalyzer.model.lotto.DrawnNumber;
import pl.lottoanalyzer.model.lotto.Lot;
import pl.lottoanalyzer.model.lotto.RelNumberLot;

/**
 * User: mgalezewska
 * Date: 2015-05-18
 */
public class RelNumberLotDto implements IDto<RelNumberLot> {

    private Long relNumberId;
    private DrawnNumber drawnNumber;
    private Lot lot;

    @Override
    public RelNumberLot getEntity() {
        RelNumberLot relNumberLot = new RelNumberLot();
        relNumberLot.setRelNumberId(relNumberId);
        relNumberLot.setDrawnNumber(drawnNumber);
        relNumberLot.setLot(lot);
        return relNumberLot;
    }

    public Long getRelNumberId() {
        return relNumberId;
    }

    public void setRelNumberId(Long relNumberId) {
        this.relNumberId = relNumberId;
    }

    public DrawnNumber getDrawnNumber() {
        return drawnNumber;
    }

    public void setDrawnNumber(DrawnNumber drawnNumber) {
        this.drawnNumber = drawnNumber;
    }

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }
}
