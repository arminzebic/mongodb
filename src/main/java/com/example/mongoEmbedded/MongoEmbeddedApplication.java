package com.example.mongoEmbedded;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoEmbeddedApplication {
//	MongoClientURI uri = new MongoClientURI(
//			"mongodb+srv://armin_z_86 user:Armin123!@92.36.149.11/32");
//
//	MongoClient mongoClient = new MongoClient(uri);
//	MongoDatabase database = mongoClient.getDatabase("test");

	public static void main(String[] args) {
		SpringApplication.run(MongoEmbeddedApplication.class, args);
	}
}
