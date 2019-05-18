package edu.psu.sweng894.group1.capstone.data.services;

import edu.psu.sweng894.group1.capstone.data.entities.Poll;
import edu.psu.sweng894.group1.capstone.data.entities.User;
import edu.psu.sweng894.group1.capstone.data.repositories.UserRepository;

import java.util.List;

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

    public List<Poll> getPolls() {
        return null;
    }
}
