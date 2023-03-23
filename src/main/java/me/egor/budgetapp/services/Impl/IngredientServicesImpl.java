package me.egor.budgetapp.services.Impl;

import me.egor.budgetapp.model.Ingredients;
import me.egor.budgetapp.services.IngredientServices;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class IngredientServicesImpl implements IngredientServices {
    private static Map<Integer, Ingredients> ingredients = new LinkedHashMap<>();
    @Override
    public void addIngredient(Ingredients ingredient) {
        ingredients.put(ingredient.getId(), ingredient);
    }

    @Override
    public Ingredients getIngredient(int id) {
        return ingredients.get(id);
    }
}
