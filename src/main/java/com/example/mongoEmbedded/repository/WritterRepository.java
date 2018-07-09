package com.example.mongoEmbedded.repository;

import com.example.mongoEmbedded.model.Writter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface WritterRepository extends MongoRepository<Writter,String> {

}
