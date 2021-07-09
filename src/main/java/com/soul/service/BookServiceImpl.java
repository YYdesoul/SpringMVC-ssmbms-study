package com.soul.service;

import com.soul.dao.BookMapper;
import com.soul.pojo.Book;

import java.util.List;

public class BookServiceImpl implements BookService{

    BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book getBookById(int id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}
