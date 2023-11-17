package com.spring.test.demo.repositories;
import  com.spring.test.demo.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface BookRepo
        extends MongoRepository<Book, Integer> {
}