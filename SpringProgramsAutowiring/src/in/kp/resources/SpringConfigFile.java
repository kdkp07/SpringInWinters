package in.kp.resources;

import in.kp.beans.Address;
import in.kp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddr1(){
        Address addr = new Address();
        addr.setPincode(123442);
        addr.setCity("Ujjain");
        addr.setHouseno(234);
        return addr;
    }

    @Bean
    public Address createAddr2(){
        Address addr = new Address();
        addr.setPincode(522342);
        addr.setCity("Indore");
        addr.setHouseno(321);
        return addr;
    }
    @Bean
    public Student createStd(){
        Student std = new Student();
        std.setName("Kuldeep");
        std.setRollno(232);
        // here the address field has been set by Autowired keyword inside the Address class
        return std;
    }


}
