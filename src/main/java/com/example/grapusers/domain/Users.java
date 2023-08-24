package com.example.grapusers.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
@Data
public class Users {

    private String name;
    private Integer age;
    private String email;
}
