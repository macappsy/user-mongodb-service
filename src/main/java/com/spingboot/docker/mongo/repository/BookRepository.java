package com.spingboot.docker.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spingboot.docker.mongo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
