package in.kp.resources;

import in.kp.beans.Address;
import in.kp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddrObj(){
        Address adr = new Address();
        adr.setHouseno(759);
        adr.setCity("Chennai");
        adr.setPincode(345234);

        return adr;
    }

    @Bean
    public Student createStdObj(){
        Student std = new Student();

        std.setName("Rahul");
        std.setRollno(341);
        std.setAddress(createAddrObj());

        return std;
    }
}
