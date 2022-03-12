package com.example.SpringInit.Controller;

import com.example.SpringInit.Model.User;
import com.example.SpringInit.Repository.MongoRepoitory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongo")
@RequiredArgsConstructor
public class MongoController {

    private final MongoRepoitory mongoRepoitory;

    @ResponseBody
    @PostMapping(path = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser (@RequestBody User user) {
        return mongoRepoitory.saveUser(user);
    }

    @ResponseBody
    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUsers () {
        return mongoRepoitory.getAllUserFromMongo();
    }
}
