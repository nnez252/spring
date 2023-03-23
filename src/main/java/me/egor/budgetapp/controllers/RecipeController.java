package me.egor.budgetapp.controllers;

import me.egor.budgetapp.model.Ingredients;
import me.egor.budgetapp.model.Recipe;
import me.egor.budgetapp.services.IngredientServices;
import me.egor.budgetapp.services.RecipeServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private RecipeServices recipeServices;
    private IngredientServices ingredientServices;

    public RecipeController(RecipeServices recipeServices, IngredientServices ingredientServices) {
        this.recipeServices = recipeServices;
        this.ingredientServices = ingredientServices;
    }

    @PostMapping
    public void addRecipe(@RequestBody Recipe recipe) {
        recipeServices.addRecipe(recipe);
    }

    @GetMapping("/id")
    public Recipe getRecipe(@PathVariable int id) {
        return recipeServices.getRecipe(id);
    }
    @PostMapping
    public void addIngredient(@RequestBody Ingredients ingredient) {
        ingredientServices.addIngredient(ingredient);
    }

    @GetMapping("/id")
    public Ingredients getIngredient(@PathVariable int id) {
        return ingredientServices.getIngredient(id);
    }

}


