package db;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Tricou {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Map<String, Culoare> tricouri;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, Culoare> getTricouri() {
        return tricouri;
    }

    public void setTricouri(Map<String, Culoare> tricouri) {
        this.tricouri = tricouri;
    }
}
