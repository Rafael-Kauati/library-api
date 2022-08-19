package com.example.library.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

@Deprecated
@Configuration
public class BookConfig {

    @BeanProperty
    CommandLineRunner  commandLineRunner(
            BookRepository bookRepository
    ){
        return args -> { Book lotr = new Book("Lord of the rings", "JRR Tolkien", LocalDate.of(1954, Calendar.JULY,29));
                        Book memories = new Book("Memórias Póstumas de Brás Cubas", "Machado of Assis", LocalDate.of(1880, Calendar.JANUARY, 1));
            bookRepository.saveAll(List.of(lotr,memories)); };
    }
}
