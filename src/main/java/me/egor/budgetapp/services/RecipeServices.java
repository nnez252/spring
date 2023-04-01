package me.egor.budgetapp.services;

import me.egor.budgetapp.model.Recipe;

 public interface RecipeServices {


     void addRecipe(Recipe recipe);

     Recipe getRecipe(int id);
 }
