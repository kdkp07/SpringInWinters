package in.kp.main;

import in.kp.beans.Laptop;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("in/kp/resources/applicationContext.xml");
        Laptop l = (Laptop) context.getBean("laptop");
        l.display();
        context.registerShutdownHook();
    }
}
