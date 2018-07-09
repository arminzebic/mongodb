package com.example.mongoEmbedded.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "writer")
public class Writter implements Serializable {

    @Id
    private String id;

    private String name;

    private String about;

    public void setId(String id) {
        id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }
}
