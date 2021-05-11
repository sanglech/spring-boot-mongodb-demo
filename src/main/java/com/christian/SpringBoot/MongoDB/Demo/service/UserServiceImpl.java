package com.christian.SpringBoot.MongoDB.Demo.service;

import java.util.List;
import java.util.Optional;

import com.christian.SpringBoot.MongoDB.Demo.document.User;
import com.christian.SpringBoot.MongoDB.Demo.repository.primary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public List<User> getAllUsers() {
       return userRepository.findAll();
    }


    @Override
    @Transactional
    public User getUserById(String userId){

        Optional<User> opUser= userRepository.findById(userId);
        User theUser=null;

        if(opUser.isPresent()){
            theUser= opUser.get();
        }
        return theUser;
    }

    @Override
    @Transactional
    public User addNewUser(User user) {
        userRepository.save(user);
        // Now, user object will contain the ID as well
        return user;
    }

    @Override
    @Transactional
    public Object getAllUserSettings(String userId) {
        Optional<User> opUser= userRepository.findById(userId);
        User theUser=null;

        if(opUser.isPresent()){
            theUser= opUser.get();
            return theUser.getUserSettings();
        }
        else{
            return "User not found";
        }
    }

    @Override
    @Transactional
    public String getUserSetting(String userId, String key) {
        Query query = new Query();
        query.fields().include("userSettings");
        query.addCriteria(Criteria.where("userId").is(userId).andOperator(Criteria.where("userSettings." + key).exists(true)));

        User opUserSetting= userRepository.findByUserIdAndUserSettingsNotNull(userId,key);

        if(opUserSetting!=null){
            return opUserSetting.getUserSettings().get(key);
        }

        else{
            return "Not found";
        }
    }

    @Override
    @Transactional
    public String addUserSetting(String userId, String key, String value) {
        Optional<User> opUser= userRepository.findById(userId);
        User theUser=null;

        if(opUser.isPresent()){
            theUser= opUser.get();
            theUser.getUserSettings().put(key,value);
            userRepository.save(theUser);
            return "Key added";
        } else {
            return "User not found.";
        }
    }
}
