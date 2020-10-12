package com.example.demo.service.category;

import com.example.demo.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findByCategoryId(Long categoryId);

    void save(Category category);

    void remove(Long categoryId);


}
