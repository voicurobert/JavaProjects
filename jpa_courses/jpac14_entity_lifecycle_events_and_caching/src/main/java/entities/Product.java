package entities;

import javax.persistence.*;

@Entity
public class Product extends GeneralEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    load -- @PostLoad
    update -- pre, post
    remove -- pre, post
    persist -- pre, post
     */

    @PostLoad
    public void postLoad() {
        System.out.println("Entity " + this + " was loaded");
    }

    @PreRemove
    public void preRemove() {
        System.out.println("Entity " + this + " will be removed");
    }

    @PostRemove
    public void postRemove() {
        System.out.println("Entity " + this + " was removed");
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateCreated=" + dateCreated +
                ", lastModified=" + lastModified +
                '}';
    }
}
