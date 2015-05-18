package pl.lottoanalyzer.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Darek on 2015-03-22.
 */

@Entity
@SequenceGenerator(name = "HIBERNATE_SEQUENCE", sequenceName="HIBERNATE_SEQUENCE")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HIBERNATE_SEQUENCE")

    private Integer id;
    private Integer lortNumber;
  //  @Column(name = "lotNumber")

    private Integer number1;
    private Integer number2;
    private Integer number3;
    private Integer number4;
    private Integer number5;
    private Integer number6;
    private Date lotDate;


    public Integer getLortNumber() {
        return lortNumber;
    }

    public void setLortNumber(Integer lortNumber) {
        this.lortNumber = lortNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public Integer getNumber3() {
        return number3;
    }

    public void setNumber3(Integer number3) {
        this.number3 = number3;
    }

    public Integer getNumber4() {
        return number4;
    }

    public void setNumber4(Integer number4) {
        this.number4 = number4;
    }

    public Integer getNumber5() {
        return number5;
    }

    public void setNumber5(Integer number5) {
        this.number5 = number5;
    }

    public Integer getNumber6() {
        return number6;
    }

    public void setNumber6(Integer number6) {
        this.number6 = number6;
    }

    public Date getLotDate() {
        return lotDate;
    }

    public void setLotDate(Date lotDate) {
        this.lotDate = lotDate;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", number1=" + number1 +
                ", number2=" + number2 +
                ", number3=" + number3 +
                ", number4=" + number4 +
                ", number5=" + number5 +
                ", number6=" + number6 +
                ", lotDate=" + lotDate +
                '}';
    }
}
