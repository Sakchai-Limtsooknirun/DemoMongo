package com.example.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class Customer {
    @Id
    private String id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Integer age;
    @Email
    private String email;

}