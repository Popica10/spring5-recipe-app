package com.example.spring5recipeapp.service.impl;

import com.example.spring5recipeapp.model.Recipe;
import com.example.spring5recipeapp.repository.RecipeRepository;
import com.example.spring5recipeapp.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<Recipe> findAll() {
        return StreamSupport.stream(recipeRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }
}
