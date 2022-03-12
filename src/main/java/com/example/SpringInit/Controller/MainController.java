package com.example.SpringInit.Controller;

import com.example.SpringInit.DataBase.DataBase;
import com.example.SpringInit.Model.User;
import com.example.SpringInit.Service.Userervice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/web")
@RequiredArgsConstructor
public class MainController {

    private final Userervice userervice;

    @ResponseBody
    @GetMapping(path = "/one/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User one (@PathVariable(name = "id") Long id) {

       return userervice.getUserById(id);
    }

    @ResponseBody
    @PostMapping(path = "/ttt", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> saveUser (@RequestBody User user) {
        userervice.saveUser(user);
        return ResponseEntity.ok(user);
    }
}
