package com.christian.SpringBoot.MongoDB.Demo.controller;

import com.christian.SpringBoot.MongoDB.Demo.document.User;
import com.christian.SpringBoot.MongoDB.Demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("")
    public List<User> getAllUsers() {
        LOG.info("Getting all users.");
        return userRepository.findAll();
    }


    @GetMapping("/{userId}")
    public Optional<User> getUser(@PathVariable String userId) {
        LOG.info("Getting user with ID: {}.", userId);
        return userRepository.findById(userId);
    }

    @PostMapping("/create")
    public User addNewUsers(@RequestBody User user) {
        LOG.info("Saving user.");
        return userRepository.save(user);
    }


    @GetMapping("/settings/{userId}")
    public Object getAllUserSettings(@PathVariable String userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            User tempUser=user.get();
            return tempUser.getUserSettings();
        } else {
            return "User not found.";
        }
    }


    @GetMapping("/settings/{userId}/{key}/{value}")
    public String addUserSetting(@PathVariable String userId, @PathVariable String key, @PathVariable String value) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            User tempUser=user.get();
            tempUser.getUserSettings().put(key, value);
            userRepository.save(tempUser);
            return "Key added";
        } else {
            return "User not found.";
        }
    }


}
