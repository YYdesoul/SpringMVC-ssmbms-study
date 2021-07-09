package com.soul.service;

import com.soul.dao.BookMapper;
import com.soul.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    int addBook(Book book);

    int deleteBookById(int id);

    int updateBook(Book book);

    Book getBookById(int id);

    List<Book> getAllBooks();
}
