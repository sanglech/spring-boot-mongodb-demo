package com.christian.SpringBoot.MongoDB.Demo.repository.secondary;

import com.christian.SpringBoot.MongoDB.Demo.document.AirBnb;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirBnbRepository extends MongoRepository<AirBnb,String> {
}
