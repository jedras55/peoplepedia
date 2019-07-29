package com.peoplepedia.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {

    @Id
    @Column(unique=true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ObjectId userId;

    @Column(unique=true)
    @NotBlank
    private String email;

    @Column(unique=true)
    @NotBlank
    private String password;

    @Column(unique=true)
    @NotBlank
    private String login;

    @NotBlank
    private String role;


}
