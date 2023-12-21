package in.kp.beans;
// setter method DI
public class Address {
    private int houseno;
    private String city;
    private int pincode;
    public void setHouseno(int houseno) {
//        System.out.println("Inside sethouse");
        this.houseno = houseno;
    }
    public void setCity(String city) {
//        System.out.println("Inside setCity");
        this.city = city;
    }
    public void setPincode(int pincode) {
//        System.out.println("Inside setpincode");
        this.pincode = pincode;
    }
    @Override
    public String toString(){
        return "#"+houseno+", "+city+" - "+ pincode;
    }
}
