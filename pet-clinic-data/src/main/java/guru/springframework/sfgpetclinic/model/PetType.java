package guru.springframework.sfgpetclinic.model;

import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * Created by jt on 7/13/18.
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
