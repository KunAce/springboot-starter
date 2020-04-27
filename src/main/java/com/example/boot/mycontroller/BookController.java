package com.example.boot.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class BookController {
    @GetMapping("/book")
    @ResponseBody
    public Book book() {
        Book book = new Book();
        book.setAuthor("Author1");
        book.setName("Book1");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }

}
