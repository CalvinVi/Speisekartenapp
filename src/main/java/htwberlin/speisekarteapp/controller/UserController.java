package htwberlin.speisekarteapp.controller;

import htwberlin.speisekarteapp.model.Gericht;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping
public class UserController {
    @GetMapping("/hello")
    public ResponseEntity<String> helloworld(@RequestParam("text") String text) {
        return ResponseEntity.ok("Hello World"+ text );
    }
    @GetMapping("/gericht")
    public ResponseEntity<Gericht> getGericht() {
        // Annahme: Hier wird ein Gericht mit festen Werten erstellt
        Gericht gericht = new Gericht("Pizza", "Pizza Margherita", 7,true);
        return ResponseEntity.ok(gericht);
    }
}
