package com.christian.SpringBoot.MongoDB.Demo.repository;

import com.christian.SpringBoot.MongoDB.Demo.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
