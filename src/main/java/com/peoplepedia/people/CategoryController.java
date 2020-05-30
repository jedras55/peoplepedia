package com.peoplepedia.people;

import org.apache.tomcat.util.digester.ArrayStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/category")
public class CategoryController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping(value = "/create-category", method = RequestMethod.POST)
    public Category addNewCategory(@RequestBody Category category) {
        LOG.info("Saving category.");
        return categoryRepository.save(category);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Category> getAllCategories() {
        LOG.info("Getting all categories.");
        return categoryRepository.findAll();
    }

   @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Category getCategory(@PathVariable String id) {
       LOG.info("Getting category with ID: {}.", id);
      return categoryRepository.findOne(Category category);
 }

    @GetMapping("/get-category")
    public Category get(@RequestParam String id) {
        return categoryRepository.findOne();
    }



}
