package in.kp.beans;

public class Laptop {
    private double price;
    private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting name");
        this.name = name;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Price : " + "$"+price);
    }

    public void init(){
        System.out.println("Inside Init Method");
    }
    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
