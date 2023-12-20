package in.kp.main;

import in.kp.beans.Student;
import in.kp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
//        Student std = (Student) context.getBean("stdId1");
//        std.display();

        Student std = context.getBean(Student.class);
        std.display();
    }
}
