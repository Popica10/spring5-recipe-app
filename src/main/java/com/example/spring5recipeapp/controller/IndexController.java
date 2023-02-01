package com.example.spring5recipeapp.controller;

import com.example.spring5recipeapp.repository.CategoryRepository;
import com.example.spring5recipeapp.repository.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/","/index"})
    public String getIndexPage(){
        System.out.println("Category Id is: " + categoryRepository.findByDescription("American").get().getId());
        System.out.println("UnitOfMeasure Id is: " + unitOfMeasureRepository.findByDescription("Teaspoon").get().getId());
        return "index";
    }
}
