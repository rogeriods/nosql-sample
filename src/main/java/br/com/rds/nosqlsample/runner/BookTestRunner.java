package br.com.rds.nosqlsample.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.rds.nosqlsample.entity.Book;
import br.com.rds.nosqlsample.repo.BookRepository;

@Component
public class BookTestRunner implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepo;

    @Override
    public void run(String... args) {
        // Remove old data
        bookRepo.deleteAll();

        // Creating 4 books
        bookRepo.saveAll(Arrays.asList(
            new Book(501, "Core Java", "Kathy Sierra", 1065.5),
            new Book(502, "Spring in Action", "Craig Walls", 940.75),
            new Book(503, "Hibernate in Action", "Gavin King", 889.25),
            new Book(504, "Practical MONGODB", "Sarah Gupta", 785.0)
        ));

        System.out.println("All Data created into MONGODB");

        // Updating ID(PK) manually (allowed) : It will create one new record
        bookRepo.save(new Book("ISBN10:1484240251", 504, "Practical MONGODB", "Navin Sale", 785.0));

        // Printing all books
        List<Book> bookList = bookRepo.findAll();
        bookList.forEach(System.out::println);
    }

}
