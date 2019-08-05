package com.peoplepedia.people;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private Date birthday;

    @NotBlank
    private String role;

    @NotBlank
    private String profession;

    @NotBlank
    private String nationality;

    private Date dateOfDeath;

    private String achievements;

    @OneToMany(mappedBy = "category")
    private Category category;
}