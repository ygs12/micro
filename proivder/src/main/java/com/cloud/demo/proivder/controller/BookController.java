package com.cloud.demo.proivder.controller;

import com.cloud.demo.proivder.domain.BookInfo;
import com.cloud.demo.proivder.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("{bookId}")
    public BookInfo getBook(@PathVariable("bookId") Long bookId) {
        return  bookService.getBook(bookId);
    }
}
