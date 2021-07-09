package com.soul.dao;

import com.soul.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    int addBook(Book book);

    int deleteBookById(@Param("bookID") int id);

    int updateBook(Book book);

    Book getBookById(@Param("bookID") int id);

    List<Book> getAllBooks();
}
