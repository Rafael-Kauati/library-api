package com.example.library.book;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity(name = "Book")
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Doc_sequence")
    @SequenceGenerator(name = "Doc_sequence", sequenceName = "Doc_sequence", allocationSize = 1)
    @Column(name = "doc_id", nullable = false)
    private Long docId;
    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name= "release_date", nullable = false)
    private LocalDate releaseDate;

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public Book() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(docId, book.docId) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docId, title);
    }

    public Book(String title, String author, LocalDate releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
