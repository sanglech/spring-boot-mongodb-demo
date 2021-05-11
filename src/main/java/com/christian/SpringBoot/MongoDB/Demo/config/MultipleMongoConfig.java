package com.christian.SpringBoot.MongoDB.Demo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MultipleMongoConfig {

    @Primary
    @Bean(name = "primary")
    @ConfigurationProperties(prefix = "spring.data.mongodb")
    public MongoProperties getPrimary() {
        return new MongoProperties();
    }

    @Bean(name = "secondary")
    @ConfigurationProperties(prefix = "mongodb")
    public MongoProperties getSecondary() {
        return new MongoProperties();
    }

    @Primary
    @Bean(name = "primaryMongoTemplate")
    public MongoTemplate primaryMongoTemplate() throws Exception {
        return new MongoTemplate(primaryFactory(getPrimary()));
    }

    @Bean(name = "secondaryMongoTemplate")
    public MongoTemplate secondaryMongoTemplate() throws Exception {
        return new MongoTemplate(secondaryFactory(getSecondary()));
    }

    @Bean
    @Primary
    public MongoDatabaseFactory primaryFactory(final MongoProperties mongo) throws Exception {
        MongoClient mongoClient = MongoClients.create(mongo.getUri());
        return new SimpleMongoClientDatabaseFactory(mongoClient, mongo.getDatabase());
    }

    @Bean
    public MongoDatabaseFactory secondaryFactory(final MongoProperties mongo) throws Exception {
        MongoClient mongoClient = MongoClients.create(mongo.getUri());
        return new SimpleMongoClientDatabaseFactory(mongoClient, mongo.getDatabase());
    }
}