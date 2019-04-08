package guru.springframework.sfgpetclinic.controller;

import guru.springframework.sfgpetclinic.model.Category;
import guru.springframework.sfgpetclinic.model.UnitOfMeasure;
import guru.springframework.sfgpetclinic.repository.CategoryRepository;
import guru.springframework.sfgpetclinic.repository.UnitOfMeasureRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

//@Controller
//@RestController
//@RequestMapping("/recipe")
public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}
	
	@RequestMapping({"","/","/recipeindex"})
	public String getIndexPage() {
		return "index";
	}
}
