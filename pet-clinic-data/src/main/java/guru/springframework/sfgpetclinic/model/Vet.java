package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
public class Vet extends Person {
	private Set<Speciality> specialties = new HashSet<>();
	
	public Set<Speciality> getSpecialties() {
		return specialties;
	}
	
	public void setSpecialties(Set<Speciality> specialties) {
		this.specialties = specialties;
	}
}
