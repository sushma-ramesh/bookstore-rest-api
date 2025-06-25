package com.example.bookstore.service.impl;

import com.example.bookstore.exception.ResourceNotFoundException;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBook(Long id) {
        return bookRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Book not found"));
    }

    public Page<Book> getAllBooks(String category, String title, Pageable pageable) {
        if (category != null) {
            return bookRepository.findByCategoryContainingIgnoreCase(category, pageable);
        } else if (title != null) {
            return bookRepository.findByTitleContainingIgnoreCase(title, pageable);
        } else {
            return bookRepository.findAll(pageable);
        }
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}