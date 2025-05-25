package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Admin {
    private String name;
    private String identificationNumber;

    public Admin(String name, String identificationNumber) {
        this.name = name;
        this.identificationNumber = identificationNumber;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", identificationNumber='" + identificationNumber + '\'' +
                '}';
    }
}
