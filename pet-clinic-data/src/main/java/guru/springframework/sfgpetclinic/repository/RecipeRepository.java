package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
