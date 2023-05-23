package com.alexquazar.SpringPracticeRecipes.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alexquazar.SpringPracticeRecipes.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{
    
}
