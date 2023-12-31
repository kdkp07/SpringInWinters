package in.kp.beans;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.PropertyResourceBundle;

public class Person {
    private List<String> friends;
    private Map<String ,Double> fee_structure;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, Double> getFee_structure() {
        return fee_structure;
    }

    public void setFee_structure(Map<String, Double> fee_structure) {
        this.fee_structure = fee_structure;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", fee_structure=" + fee_structure +
                ", properties=" + properties +
                '}';
    }
}
