package lib.db;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PlateNumber implements Serializable {

    private String county;
    private int number;
    private String code;

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return county + " " + number + " " + code;
    }
}
