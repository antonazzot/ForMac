package com.example.SpringInit.Service;

import com.example.SpringInit.DataBase.DataBase;
import com.example.SpringInit.Model.User;
import com.example.SpringInit.Repository.MyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Userervice {
private final MyRepository myRepository;

   public User getUserById (Long id) {
        return myRepository.findById(id).orElse(null);
    }

   public void saveUser (User user) {
       myRepository.save(user);
   }

   public User getUserByName (String name) {
      return myRepository.findUserByUserName(name);
   }
}
