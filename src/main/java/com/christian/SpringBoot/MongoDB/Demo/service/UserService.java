package com.christian.SpringBoot.MongoDB.Demo.service;

import com.christian.SpringBoot.MongoDB.Demo.document.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(String userId);

    User addNewUser(User user);

    Object getAllUserSettings(String userId);

    String getUserSetting(String userId, String key);

    String addUserSetting(String userId, String key, String value);
}
