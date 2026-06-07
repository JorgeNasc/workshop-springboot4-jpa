package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResouce {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Jorge", "jorge.dev@yahoo.com", "9999-9999","123");
        return ResponseEntity.ok().body(u);
    }
}
