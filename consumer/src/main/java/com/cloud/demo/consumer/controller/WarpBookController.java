package com.cloud.demo.consumer.controller;

import com.cloud.demo.consumer.feign.BookClient;
import com.cloud.demo.consumer.vo.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("warp/book")
// 没有问题
public class WarpBookController {

    @Autowired
    private BookClient client;

    @GetMapping("{bookId}")
    public BookVo getBook(@PathVariable("bookId") Long bookId) {
        return client.getBookById(bookId);
    }
}
