package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Recipe;

import java.util.Set;

public interface RecipeService {
	
	Set<Recipe> getRecipes();

}
