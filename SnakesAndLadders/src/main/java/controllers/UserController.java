package controllers;

import models.User;
import services.UserService;

public class UserController {
    private UserService userService = new UserService();

    public User createUser(String username, String email) {
        return userService.createUser(username, email);
    }
}
