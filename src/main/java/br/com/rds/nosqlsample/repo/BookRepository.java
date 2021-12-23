package br.com.rds.nosqlsample.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.rds.nosqlsample.entity.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
