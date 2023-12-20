package in.kp.Main;

import in.kp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String config_loc ="in/kp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
        Student st = (Student) context.getBean("stdId");
        st.display();

    }
}
