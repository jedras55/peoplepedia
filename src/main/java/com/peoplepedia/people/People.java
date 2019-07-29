package com.peoplepedia.people;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
public class People {

    @Id
    @Column(unique=true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ObjectId id;

    @Column(unique=true)
    @NotBlank
    private String name;

    @Column(unique=true)
    @NotBlank
    private String surname;

    @Column(unique=true)
    @NotBlank
    private String birthday;

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