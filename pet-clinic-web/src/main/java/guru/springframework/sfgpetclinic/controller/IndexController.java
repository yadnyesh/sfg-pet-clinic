package guru.springframework.sfgpetclinic.controller;

import guru.springframework.sfgpetclinic.model.Category;
import guru.springframework.sfgpetclinic.model.UnitOfMeasure;
import guru.springframework.sfgpetclinic.repository.CategoryRepository;
import guru.springframework.sfgpetclinic.repository.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}
	
	@RequestMapping({"","/","index","index.html"})
	public String index() {
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
		System.out.println("Cat Id is: " + categoryOptional.get().getId());
		System.out.println("UON Id is: " +unitOfMeasureOptional.get().getId());
		return "index";
		
	}
	
	@RequestMapping("/oups")
	public String oupsHandler() {
		return "notimplemented";
	}
	
	
}
