package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
