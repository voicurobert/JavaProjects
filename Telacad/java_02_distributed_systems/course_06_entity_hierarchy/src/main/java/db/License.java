package db;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class License implements Serializable {

    private String regiune;

    private int nr;

    private String cod;

    public String getRegiune() {
        return regiune;
    }

    public void setRegiune(String regiune) {
        this.regiune = regiune;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}
