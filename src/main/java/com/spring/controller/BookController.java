package com.spring.controller;

import com.spring.entity.Book;
import com.spring.graphqlDto.BookInput;
import com.spring.service.interf.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    @MutationMapping("createBook")
    Book createBook(@Argument BookInput book){
        return bookService.saveBooks(book);
    }

    @QueryMapping("getBook")
    Book getBookById(@Argument Long id){
        return  bookService.getBookById(id);
    }

    @QueryMapping("allBooks")
    List<Book> getAllBooks(){
        return  bookService.getAllBooks();
    }
}
