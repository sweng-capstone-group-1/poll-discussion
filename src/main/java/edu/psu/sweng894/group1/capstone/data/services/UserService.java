package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.User;
import edu.psu.sweng894.group1.capstone.data.repositories.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return null;
    }

    public User updateUser(User user) {
        return null;
    }

    public User deleteUser(User user) {
        return null;
    }
}
