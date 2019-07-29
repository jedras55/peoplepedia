package com.peoplepedia.people;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class Category {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ObjectId categoryId;

    @Column(unique = true)
    @NotBlank
    private String label;

    @NotBlank
    private String description;

}
