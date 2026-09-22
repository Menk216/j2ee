package com.example.demo.bai2.service;

import com.example.demo.bai2.bean.Book;
import java.util.Optional;

public interface BookService {
    Iterable<Book> findAll();
    Book create(Book book);
    Optional<Book> find(String isbn);
}
