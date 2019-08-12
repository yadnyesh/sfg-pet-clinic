package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
@Entity
@Table(name = "vets")
@AllArgsConstructor
@NoArgsConstructor
public class Vet extends Person {
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vet_specialities",
			   joinColumns = @JoinColumn(name = "vet_id"),
			   inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	private Set<Speciality> specialties = new HashSet<>();
	
	public Set<Speciality> getSpecialties() {
		return specialties;
	}
	
	public void setSpecialties(Set<Speciality> specialties) {
		this.specialties = specialties;
	}
}
