package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Operator {
    private String name;
    private String id;

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
