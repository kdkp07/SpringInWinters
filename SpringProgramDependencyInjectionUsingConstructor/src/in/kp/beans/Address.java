package in.kp.beans;
// setter method DI
public class Address {
    private int houseno;
    private String city;
    private int pincode;

    public Address (int houseno,String city,int pincode){
        this.pincode = pincode;
        this.city = city;
        this.houseno = houseno;
    }
    @Override
    public String toString(){
        return "#"+houseno+", "+city+" - "+ pincode;
    }
}
