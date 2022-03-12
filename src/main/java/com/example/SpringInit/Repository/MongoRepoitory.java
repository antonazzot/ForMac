package com.example.SpringInit.Repository;

import com.example.SpringInit.Model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MongoRepoitory {
    private  final MongoTemplate mongoTemplate;

    public User getUserFromMongo(Long id) {
        return mongoTemplate.findById(id, User.class);
    }
    public List<User> getAllUserFromMongo() {
       return mongoTemplate.findAll(User.class);
    }

    public User saveUser (User user) {
        return mongoTemplate.save(user);
    }

}
