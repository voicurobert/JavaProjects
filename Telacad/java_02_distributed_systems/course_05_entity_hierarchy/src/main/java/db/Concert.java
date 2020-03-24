package db;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

@Entity
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ElementCollection
    private Map<Date, String> locatii;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Date, String> getLocatii() {
        return locatii;
    }

    public void setLocatii(Map<Date, String> locatii) {
        this.locatii = locatii;
    }
}
