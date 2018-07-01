package com.example.mongoEmbedded.repository;

import com.example.mongoEmbedded.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface BookRepository extends MongoRepository<Book, String> {
}
