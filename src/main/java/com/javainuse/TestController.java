package com.javainuse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

    @RequestMapping("/welcome.html")
    public String firstPage() {
        return "Welcome to Spring Boot application";
    }

}