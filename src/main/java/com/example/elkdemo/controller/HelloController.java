package com.example.elkdemo.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello(@RequestParam int id) throws Exception {

        if (id == 0) {
            throw new Exception("id is 0");
        }
        logger.info("logback de logger, id is: " + id);

        return "hello, ELK";
    }
}
