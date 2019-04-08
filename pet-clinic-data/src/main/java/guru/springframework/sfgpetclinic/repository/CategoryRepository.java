package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	Optional<Category> findByDescription(String description);
	
}

