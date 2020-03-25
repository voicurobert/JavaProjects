package db;

import java.io.Serializable;

public class NumeComplet implements Serializable {

    private String nume;

    private String prenume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumeComplet)) return false;

        NumeComplet that = (NumeComplet) o;

        if (getNume() != null ? !getNume().equals(that.getNume()) : that.getNume() != null) return false;
        return getPrenume() != null ? getPrenume().equals(that.getPrenume()) : that.getPrenume() == null;
    }

    @Override
    public int hashCode() {
        int result = getNume() != null ? getNume().hashCode() : 0;
        result = 31 * result + (getPrenume() != null ? getPrenume().hashCode() : 0);
        return result;
    }
}
