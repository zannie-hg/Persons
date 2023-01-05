package Model;

public class Teacher extends Person{
    private int Experience;

    public Teacher() {
        super();
    }

    public Teacher(String name, String address, int iD, int age, int experience) {
        super(name, address, iD, age);
        Experience = experience;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    } 

    @Override
    public String toString() {
        return "Teacher [ID=" + super.getID() + ",name=" + super.getName() + ", address=" + super.getAddress() + ", age=" + super.getAge() + "Experience=" + Experience + "]";
    }
    
    
}
