package htwberlin.speisekarteapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping
public class UserController {
    @GetMapping("Hello")
    public ResponseEntity<String> helloworld(@RequestParam("text") String text) {
        return ResponseEntity.ok("Hello World" + text);
    }}
