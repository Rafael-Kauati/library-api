package com.example.library.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.beans.BeanProperty;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

@Configuration
@Component
public class BookRunnerConfig implements  CommandLineRunner{
    private static final Logger logger  = LoggerFactory.getLogger(BookRunnerConfig.class);

    private final BookRepository  bookRepository;

    public BookRunnerConfig(BookRepository bookRepository) {this.bookRepository = bookRepository;}

    @Override
    public void run(String... args){
        bookRepository.deleteAll();

        bookRepository.save(new Book("Lord of the rings", "JRR Tolkien", LocalDate.of(1954, Calendar.JULY,29)));
        bookRepository.save(new Book("Memórias Póstumas de Brás Cubas", "Machado of Assis", LocalDate.of(1880, 1, 1)));
        //bookRepository.findAll().forEach( (book) -> logger.info("{}",book) );
    }
}
