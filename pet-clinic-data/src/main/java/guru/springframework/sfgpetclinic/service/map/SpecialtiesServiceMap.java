package guru.springframework.sfgpetclinic.service.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.service.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtiesService {
	
	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}
	
	@Override
	public void deleteById(Long id) {
		super.findById(id);
	}
	
	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}
	
	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}
	
	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}
}
