package in.kp.main;

import in.kp.beans.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("in/kp/resources/applicationContext.xml");
        Developer developer = context.getBean("developer",Developer.class);
        System.out.println(developer);
    }
}
