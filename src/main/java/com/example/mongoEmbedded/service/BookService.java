package com.example.mongoEmbedded.service;


import com.example.mongoEmbedded.model.Book;
import com.example.mongoEmbedded.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book create(Book item) {
        String id = java.util.UUID.randomUUID().toString();
        item.setId(id);
        Book newItem = bookRepository.insert(item);
        return item;
    }
}
