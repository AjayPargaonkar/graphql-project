package com.spring.service.impl;


import com.spring.entity.Book;
import com.spring.graphqlDto.BookInput;
import com.spring.repository.BookRepository;
import com.spring.service.interf.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBooks(BookInput bookInput) {
        Book book = Book.builder()
                .title(bookInput.getTitle())
                .price(bookInput.getPrice())
                .author(bookInput.getAuthor())
                .description(bookInput.getDescription())
                .pages(bookInput.getPages())
                .build();
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        Book book = new Book();
        if(bookOptional.isPresent()){
            book = bookOptional.get();
        }
        return book;
    }
}
