package com.alexquazar.SpringPracticeRecipes.services;

import java.util.Set;

import com.alexquazar.SpringPracticeRecipes.model.Recipe;

public interface RecipeService {
    
    Set<Recipe> getRecipes();
}