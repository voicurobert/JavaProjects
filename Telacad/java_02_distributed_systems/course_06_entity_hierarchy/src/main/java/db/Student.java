package db;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(NumeComplet.class)
public class Student {

    private int varsta;

    @Id
    private String nume;

    @Id
    private String prenume;

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

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
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getVarsta() != student.getVarsta()) return false;
        if (!getNume().equals(student.getNume())) return false;
        return getPrenume().equals(student.getPrenume());
    }

    @Override
    public int hashCode() {
        int result = getVarsta();
        result = 31 * result + getNume().hashCode();
        result = 31 * result + getPrenume().hashCode();
        return result;
    }
}
