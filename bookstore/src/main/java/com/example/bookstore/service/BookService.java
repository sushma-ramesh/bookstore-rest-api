package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {
    Book createBook(Book book);
    Book getBook(Long id);
    Page<Book> getAllBooks(String category, String title, Pageable pageable);
    void deleteBook(Long id);
}