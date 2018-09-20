package com.cloud.demo.proivder.service;

import com.cloud.demo.proivder.domain.BookInfo;

public interface BookService {
    BookInfo getBook(Long bookId);
}
