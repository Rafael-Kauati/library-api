package com.example.library.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {this.bookRepository = bookRepository;}

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    //new Book("Lord of the rings", "JRR Tolkien", new Date(1954, Calendar.JULY,29))
    //new Book("Memórias Póstumas de Brás Cubas", "Machado of Assis", new Date(1880, Calendar.JANUARY, 1)
}
