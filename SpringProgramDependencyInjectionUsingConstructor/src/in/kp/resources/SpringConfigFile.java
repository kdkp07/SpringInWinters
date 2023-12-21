package in.kp.resources;

import in.kp.beans.Address;
import in.kp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddrObj(){
        Address addr = new Address(200,"Ramganj",523423);
        return addr;
    }
    @Bean
    public Student createStdObj(){
        Student std = new Student(301,"Dilip",createAddrObj());
        return std;
    }

}
