package com.SpringBootJPA.SpringBootJPA_Demo.Service;


import com.SpringBootJPA.SpringBootJPA_Demo.Model.User;
import com.SpringBootJPA.SpringBootJPA_Demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    // Get all users
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // Get user by ID
    public User getUserById(Long id) {
        return userRepo.findById(id).orElseThrow(() ->
                new RuntimeException("User not found with id: " + id)
        );
    }

    // Create a new user
    public User createUser(User user) {
        return userRepo.save(user);
    }

    // Update user details
    public User updateUser(Long id, User updatedUser) {
        return userRepo.findById(id).map(user -> {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            return userRepo.save(user);
        }).orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    // Delete user by ID
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}



