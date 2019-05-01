package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository <UnitOfMeasure, Long> {
	Optional<UnitOfMeasure> findByDescription(String description);
}
