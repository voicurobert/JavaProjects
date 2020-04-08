package lib.db;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

@NamedQuery(name = "usernameExists",
        query = "SELECT u from User u WHERE u.username = :username")
@NamedQuery(name = "usernameAndPasswordExists",
        query = "SELECT u from User u WHERE u.username = :username AND u.password = :password")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;

    private String password;

    @OneToMany
    private List<CarRental> carRentals;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<CarRental> getCarRentals() {
        return carRentals;
    }

    public void setCarRentals(List<CarRental> carRentals) {
        this.carRentals = carRentals;
    }
}
