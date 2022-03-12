package com.example.SpringInit.Repository;

import com.example.SpringInit.Model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface MyRepository extends CrudRepository<User, Long> {

}
