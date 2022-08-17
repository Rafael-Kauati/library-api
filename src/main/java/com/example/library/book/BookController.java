package com.example.library.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController{
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {this.bookService = bookService;}

    @GetMapping
    public List<Book> getBook() {return bookService.getBooks();}
}
