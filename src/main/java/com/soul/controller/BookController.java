package com.soul.controller;

import com.soul.pojo.Book;
import com.soul.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    BookService bookService;

    @GetMapping("/getAllBooks")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("booklist", books);
        return "displayAllbooks";
    }

    @RequestMapping("/toAddBook")
    // 转跳到addBook的页面
    public String toAddBookPage() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book) {
        System.out.println(book);
        bookService.addBook(book);
        return "redirect:/book/getAllBooks";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, @Param("id") int id) {
        System.out.println("entered toUpdateBook method");
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "updateBook";
    }

    @PostMapping("/updateBook")
    public String updateBook(Model model, Book book) {
        System.out.println("entered updateBook method");
        bookService.updateBook(book);
        System.out.println("executed bookService.updateBook() method");
        return "redirect:/book/getAllBooks";
    }

    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/getAllBooks";
    }



}
