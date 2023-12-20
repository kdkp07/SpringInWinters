package in.kp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.kp.beans.Student;
@Configuration
public class SpringConfigFile {
    @Bean
    public Student stdId1(){
        Student std = new Student();

        std.setName("Aakash");
        std.setRollno(103);
        std.setEmail("aakash@gmail.com");

        return std;
    }
}
