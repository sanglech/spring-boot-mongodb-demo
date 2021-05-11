package com.christian.SpringBoot.MongoDB.Demo.repository.primary;

import com.christian.SpringBoot.MongoDB.Demo.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User,String> {

    public User findByUserIdAndUserSettingsNotNull(String id,String key);
}
