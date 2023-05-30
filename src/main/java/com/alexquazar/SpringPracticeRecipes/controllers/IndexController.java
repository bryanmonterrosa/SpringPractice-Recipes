package com.alexquazar.SpringPracticeRecipes.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.alexquazar.SpringPracticeRecipes.model.Category;
import com.alexquazar.SpringPracticeRecipes.model.UnitOfMeasure;
import com.alexquazar.SpringPracticeRecipes.repositories.CategoryRepository;
import com.alexquazar.SpringPracticeRecipes.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @GetMapping({ "", "/", "index" })
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM IDS is: " + unitOfMeasureOptional.get().getId());
        
        return "index";
    }
}
