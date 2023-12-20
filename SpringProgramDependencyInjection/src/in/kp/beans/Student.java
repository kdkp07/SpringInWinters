package in.kp.beans;

public class Student {
    private int rollno;
    private String name;
    private Address address;

    public void setRollno(int rollno) {
        System.out.println("Inside setRollno");
        this.rollno = rollno;
    }

    public void setName(String name) {
        System.out.println("Inside setName method");
        this.name = name;
    }

    public void setAddress(Address address) {
        System.out.println("Inside setAddress method");
        this.address = address;
    }
    public void display(){
        System.out.println("Name :" + name);
        System.out.println("Roll no"+rollno);
        System.out.println("Address :"+address);
    }

}
