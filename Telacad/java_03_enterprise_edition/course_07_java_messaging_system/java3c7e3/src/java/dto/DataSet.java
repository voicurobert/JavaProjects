package dto;

import java.io.Serializable;
import java.util.List;


public class DataSet implements Serializable {

    private List<Integer> numbers;
    
    private String name;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
