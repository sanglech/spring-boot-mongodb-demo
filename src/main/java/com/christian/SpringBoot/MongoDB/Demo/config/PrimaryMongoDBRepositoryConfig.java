package com.christian.SpringBoot.MongoDB.Demo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
        basePackages = "com.christian.SpringBoot.MongoDB.Demo.repository.primary",
        mongoTemplateRef = "primaryMongoTemplate"
)
public class PrimaryMongoDBRepositoryConfig {
    
}
