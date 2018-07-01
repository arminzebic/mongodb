package com.example.mongoEmbedded.controller;

import com.example.mongoEmbedded.model.Book;
import com.example.mongoEmbedded.service.BookService;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Book> create(@RequestBody Book item) {

        Book newItem = bookService.create(item);
        return new ResponseEntity<Book>(newItem, HttpStatus.OK);
    }

}
