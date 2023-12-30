package in.kp.main;

import in.kp.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/kp/resources/applicationContext.xml");
        Person person = context.getBean("person1",Person.class);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println("=================================================================================================");
        System.out.println(person.getFee_structure().getClass().getName());
    }
}
