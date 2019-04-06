package guru.springframework.sfgpetclinic.service.map;

import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.service.SpecialtyService;

import java.util.Set;

public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {
	
	@Override
	public Set<Specialty> findAll() {
		super.findAll();
	}
	
	@Override
	public void deleteById(Long id) {
		super.findById(id);
	}
	
	@Override
	public void delete(Specialty object) {
		super.delete(object);
	}
	
	@Override
	public Specialty save(Specialty object) {
		return super.save(object);
	}
	
	@Override
	public Specialty findById(Long id) {
		super.findById(id);
	}
}
