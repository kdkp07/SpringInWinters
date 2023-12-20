package in.kp.Main;

import in.kp.beans.Student;
import in.kp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String config_loc ="in/kp/resources/applicationContext.xml";
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student st = (Student) context.getBean("student");
        st.display();
    }
}
