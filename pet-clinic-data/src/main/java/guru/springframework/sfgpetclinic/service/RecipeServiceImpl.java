package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Recipe;
import guru.springframework.sfgpetclinic.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;

import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {
	
	private final RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}
	
	@Override
	public Set<Recipe> getRecipes() {
		Set<Recipe> recipeSet = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}
	
}
