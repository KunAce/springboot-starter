package com.example.boot.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/book")
public class BookController {
    @PostMapping("/")
//    @CrossOrigin(value="http://localhost:8081", maxAge = 1800, allowedHeaders = "*") // Set up Cross-origin request in detail
    public String addBook(String name){
        return "receive:" + name;
    }

    @DeleteMapping("/{id}")
//    @CrossOrigin(value = "http://localhost:8081",maxAge = 1800, allowedHeaders = "*") // Set up Cross-origin request in detail
    public String deleteBookById(@PathVariable Long id) {
        return String.valueOf(id);
    }


    // Not for current case
    @GetMapping("/book-deprecated")
    @ResponseBody
    public String book(@ModelAttribute("b") Book book,@ModelAttribute("a") Author author) {
        return book.toString() + ">>>>" + author.toString();
    }
//    public Book book() {
//        Book book = new Book();
//        book.setAuthor("Author1");
//        book.setName("Book1");
//        book.setPrice(30f);
//        book.setPublicationDate(new Date());
//        return book;
//    }

}
