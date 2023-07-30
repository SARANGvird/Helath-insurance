package com.Solution.in.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Solution.in.model.Us;
import com.Solution.in.service.UsService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/uss")
public class UserController {
    private final UsService usService;

    @Autowired
    public UserController(UsService usService) {
        this.usService = usService;
    }

    @GetMapping
    public List<Us> getAllUss() {
        return usService.getAllUs();
    }

    @GetMapping("/{id}")
    public Optional<Us> getUserById(@PathVariable("id") Long id) {
        return usService.getUsById(id);
    }
    @PostMapping
    public ResponseEntity<Us> createUs(@RequestBody Us us) {
        Us savedUs = usService.createUs(us);
        return ResponseEntity.ok(savedUs);
    }

    @PutMapping("/{id}")
    public Us updateUs(@PathVariable("id") Long id, @RequestBody Us us) {
        return usService.updateUs(id, us);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        usService.deleteUs(id);
    }
}
