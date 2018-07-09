package com.example.mongoEmbedded.controller;

import com.example.mongoEmbedded.model.Writter;
import com.example.mongoEmbedded.service.WritterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/writters")
public class WritterController {

    @Autowired
    private WritterService writterService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Writter> create(@RequestBody Writter item) {

        Writter newItem = writterService.create(item);
        return new ResponseEntity<Writter>(newItem, HttpStatus.OK);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Object getContact(@PathVariable("id") String id) throws Exception {

        Optional<Writter> writter = writterService.get(id);
        return new ResponseEntity<>(writter, HttpStatus.OK);
    }

}
