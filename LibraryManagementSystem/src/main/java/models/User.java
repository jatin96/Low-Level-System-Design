package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    private int userId;
    private String userName;
    private List<Book> copiesBorrowed;
}
