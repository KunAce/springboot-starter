package com.example.boot.mycontroller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalConfig {
    @ModelAttribute(value = "info")
    public Map<String,String> userInfo() {
        HashMap<String,String> map = new HashMap<>();
        map.put("username","injectedUser1");
        map.put("gender","male");
        return map;
    }

    // For differencing the 'name' attribute between 'book' and 'author',
    // request in browser: http://localhost:8080/book?b.name=....&b.author=....&a.name=....&a.age=....
    @InitBinder("b")
    public void init(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }

    @InitBinder("a")
    public void init2(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }
}
