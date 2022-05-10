package services;

import models.User;
import repositories.UserRepository;

public class UserService {

    UserRepository userRepository = new UserRepository();

    public User createUser(String name, String email) {
        User user = new User();
        user.setEmail(email);
        user.setUsername(name);
        return userRepository.save(user);
    }
}
