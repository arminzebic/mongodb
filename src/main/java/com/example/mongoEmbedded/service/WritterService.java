package com.example.mongoEmbedded.service;

import com.example.mongoEmbedded.model.Writter;
import com.example.mongoEmbedded.repository.WritterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WritterService {

    @Autowired
    private WritterRepository writterRepository;

    public Writter create(Writter item) {
        String id = java.util.UUID.randomUUID().toString();
        item.setId(id);
        Writter newItem = writterRepository.insert(item);
        return item;
    }

    public Optional<Writter> get(String id) {
        Optional<Writter> contact = writterRepository.findById(id);
        return contact;
    }
}
