package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SfgPetClinicApplication.class, args);
        
        FakeDataSource fakeDataSource = (FakeDataSource) applicationContext.getBean(FakeDataSource.class);
    
        System.out.println(fakeDataSource.getUsername());
    }
}
