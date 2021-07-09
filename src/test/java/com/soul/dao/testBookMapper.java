package com.soul.dao;

import com.soul.pojo.Book;
import com.soul.service.BookService;
import com.soul.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testBookMapper {

    @Test
    public void testgetAllBooks() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("BookServiceImpl", BookService.class);
        List<Book> books = bookService.getAllBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void testGetBookById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("BookServiceImpl", BookService.class);
        Book book = bookService.getBookById(1);
        System.out.println(book);
    }

    @Test
    public void testUpdateBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("BookServiceImpl", BookService.class);
        Book book = bookService.getBookById(4);
        book.setBookCounts(100);
        bookService.updateBook(book);
    }
}
