package in.kp.main;

import in.kp.beans.Student;
import in.kp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Using XML spring configuration
        /*
        String config_file_loc = "in/kp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_file_loc);
        Student std = (Student)context.getBean("stdId");
        std.display();
        */
        //        --------------------------------------------------------------------------------

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std = (Student) context.getBean(Student.class);
        std.display();
    }
}
