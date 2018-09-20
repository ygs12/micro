package com.cloud.demo.consumer.feign;

import com.cloud.demo.consumer.vo.BookVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("provider")
public interface BookClient {

    @GetMapping("book/{bookId}")
    BookVo getBookById(@PathVariable("bookId") Long bookId);
}
