package in.kp.main;

import in.kp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String resource_file_path = "/in/kp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);

        Student std = (Student) context.getBean("student");
        std.display();
    }
}
