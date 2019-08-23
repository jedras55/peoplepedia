package com.peoplepedia.people;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepository extends MongoRepository<Category, String> {

    List<Category> findByLabel(@Param("label") String label);

}


