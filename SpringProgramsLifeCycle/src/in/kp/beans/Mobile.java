package in.kp.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Mobile implements InitializingBean , DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "price=" + price +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Mobile -- destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Mobile init");
    }
}
