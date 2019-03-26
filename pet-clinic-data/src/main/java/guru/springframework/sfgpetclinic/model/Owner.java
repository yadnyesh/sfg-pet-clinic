package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
public class Owner extends Person {
	private Set<Pet> pet;
	
	public Set<Pet> getPet() {
		return pet;
	}
	
	public void setPet(Set<Pet> pet) {
		this.pet = pet;
	}
}
