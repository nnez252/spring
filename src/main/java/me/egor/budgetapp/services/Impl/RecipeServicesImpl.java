package me.egor.budgetapp.services.Impl;

import me.egor.budgetapp.model.Recipe;
import me.egor.budgetapp.services.RecipeServices;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

 @Service
 public class RecipeServicesImpl implements RecipeServices {

     private static Map<Integer, Recipe> recipes = new LinkedHashMap<>();
     private static int id = 0;



     @Override
     public void addRecipe(Recipe recipe) {
        recipes.put(id++, recipe);
    }

     @Override
     public Recipe getRecipe(int id) {
        return recipes.get(id);
    }
 }
