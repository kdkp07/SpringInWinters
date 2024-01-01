package in.kp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Developer {

    @Value("#{langs}")
    private List<String> languages;
    @Value("#{23}")
    private int age;
    @Value("#{1300}")
    private int rank;
    @Value("#{T(java.lang.Math).E}")
    private double e;
    @Value("#{new String('Kuldeep')}")
    private String name;
    @Value("#{8>3}")
    private boolean isActive;

    @Override
    public String toString() {
        return "Developer{" +
                "languages=" + languages +
                ", age=" + age +
                ", rank=" + rank +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
