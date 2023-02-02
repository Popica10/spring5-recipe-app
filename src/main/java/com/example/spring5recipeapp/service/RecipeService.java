package com.example.spring5recipeapp.service;

import com.example.spring5recipeapp.model.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> findAll();
}
