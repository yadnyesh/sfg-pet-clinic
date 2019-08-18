package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
	Owner findByLastName(String lastName);

	List<Owner> findAllByLastNameLike(String lastName);
}