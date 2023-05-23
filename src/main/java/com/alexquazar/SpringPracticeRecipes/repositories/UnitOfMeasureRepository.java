package com.alexquazar.SpringPracticeRecipes.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alexquazar.SpringPracticeRecipes.model.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
    
}
