package com.alexquazar.SpringPracticeRecipes.services;

import com.alexquazar.SpringPracticeRecipes.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
