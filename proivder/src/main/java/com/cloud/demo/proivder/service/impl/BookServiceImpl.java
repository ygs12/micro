package com.cloud.demo.proivder.service.impl;

import com.cloud.demo.proivder.dao.BookMapper;
import com.cloud.demo.proivder.domain.BookInfo;
import com.cloud.demo.proivder.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public BookInfo getBook(Long bookId) {
        return bookMapper.getBookById(bookId);
    }
}
