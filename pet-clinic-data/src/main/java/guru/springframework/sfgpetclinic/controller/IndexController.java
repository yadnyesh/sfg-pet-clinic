package guru.springframework.sfgpetclinic.controller;

import guru.springframework.sfgpetclinic.repository.CategoryRepository;
import guru.springframework.sfgpetclinic.repository.UnitOfMeasureRepository;
import guru.springframework.sfgpetclinic.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@RestController
@RestController
@RequestMapping("/recipe")
public class IndexController {
	
	private final RecipeService recipeService;
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	public IndexController(RecipeService recipeService, CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.recipeService = recipeService;
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}
	
	@RequestMapping({"","/","/recipeindex"})
	public String getIndexPage(Model model) {
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}
}
