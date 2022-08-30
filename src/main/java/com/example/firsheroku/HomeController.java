package com.example.firsheroku;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@RequestMapping("/main")
public class HomeController {

    @GetMapping("/status")
    public ResponseEntity<String> getAllDetails(Model model, WebRequest request) {
        return ResponseEntity.ok("ok");
    }
}
