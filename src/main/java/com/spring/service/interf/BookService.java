package com.spring.service.interf;

import com.spring.entity.Book;
import com.spring.graphqlDto.BookInput;

import java.util.List;

public interface BookService {

    Book saveBooks(BookInput book);

    List<Book> getAllBooks();

    Book getBookById(Long id);
}
