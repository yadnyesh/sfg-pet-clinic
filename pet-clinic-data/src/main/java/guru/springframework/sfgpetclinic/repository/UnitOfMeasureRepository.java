package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Category;
import guru.springframework.sfgpetclinic.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository <UnitOfMeasure, Long> {
	Optional<UnitOfMeasure> findByDescription(String description);
}
