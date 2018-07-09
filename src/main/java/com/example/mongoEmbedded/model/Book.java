package com.example.mongoEmbedded.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
public class Book {

    @Id
    private String id;
    private String name;
    private String text;
    private String writterId;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getWritterId() {
        return writterId;
    }

    public void setWritterId(String writterId) {
        this.writterId = writterId;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
