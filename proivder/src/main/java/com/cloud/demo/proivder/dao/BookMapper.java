package com.cloud.demo.proivder.dao;

import com.cloud.demo.proivder.domain.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {
    @Select("SELECT BOOK_ID, BOOK_NAME, BOOK_PRICE, BOOK_DATE FROM T_BOOK WHERE BOOK_ID=#{bookId}")
    BookInfo getBookById(@Param("bookId") Long bookId);
}
