package com.example.firsheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class FirsherokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirsherokuApplication.class, args);
    }

    @RequestMapping("/")
    ResponseEntity<String> index() {
        return ResponseEntity.ok("ok FirsherokuApplication");
    }

}
