package com.example.SpringInit.Model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
//@Entity
//@Table (name = "itusers")
@Document
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(name = "name")
    private String userName;
    private String login;
//    @Column(name = "password")
    private String userPassword;
}
