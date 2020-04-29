package com.example.boot.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class BookController {
    @GetMapping("/book")
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
