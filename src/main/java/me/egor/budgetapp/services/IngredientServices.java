package me.egor.budgetapp.services;

import me.egor.budgetapp.model.Ingredients;

public interface IngredientServices {


    void addIngredient(Ingredients ingredient);

    Ingredients getIngredient(int id);
}
