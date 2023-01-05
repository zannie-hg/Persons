package Model;

public class Person {
    private String  name, address;
    private int ID, age;
    public Person() {
        this.name="";
        this.age=0;
        this.address="";
        this.ID=0;
    }
    public Person(String name, String address, int iD, int age) {
        this.name = name;
        this.address = address;
        ID = iD;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + ", ID=" + ID + ", age=" + age + "]";
    }
    
    
}
