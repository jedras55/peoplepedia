package com.peoplepedia.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

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
